package by.tms.onlinestore.servlet;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.model.Command;
import by.tms.onlinestore.model.PagesPath;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/eshop")
public class ApplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandKey = request.getParameter(RequestParam.COMMAND.getValue());
        if (commandKey == null || commandKey.isEmpty()) {
            commandKey = Command.SIGN_IN_COMMAND.getCommand();
        }
        try {
            BaseCommandController baseController = CommandControllerFactory.defineCommand(Command.fromString(commandKey));
            PagesPath pagesPath = baseController.execute(request);
            RequestDispatcher dispatcher = request.getRequestDispatcher(pagesPath.getPath());
            dispatcher.forward(request, response);
        } catch (ValidationException e) {
            //валидационная ошибка
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            логируем сообщение а потом должны перенаправить на страницу с ошибкой("Извините что-то поломалось!!!"),
            //https://blog.hubspot.com/marketing/http-500-internal-server-error
//            также можно конверсейшен в URL запроса поместить
            request.getRequestDispatcher(PagesPath.SIGN_IN_PAGE.getPath()).forward(request, response);
        }
    }
}



