package by.tms.onlinestore.servlet;

import by.tms.onlinestore.dto.UserDto;
import by.tms.onlinestore.model.Category;
import by.tms.onlinestore.service.CategoryService;
import by.tms.onlinestore.service.impl.CategoryServiceImpl;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.tms.onlinestore.utils.Utils.isUserLogIn;

@Slf4j
@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    private CategoryService categoryService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        categoryService = (CategoryServiceImpl) config.getServletContext().getAttribute("categoryService");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        checkReceivedUser(userDto, request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDto userDto = (UserDto) request.getSession().getAttribute("userDto");
        checkReceivedUser(userDto, request, response);
    }

    private void checkReceivedUser(UserDto userDto, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isUserLogIn(userDto)) {
            List<Category> categories = categoryService.getCategories();
            request.setAttribute("categories", categories);
            System.out.println("checkReceivedUser good, forward to home");
            request.getRequestDispatcher("home.jsp").forward(request, response);

        } else {
            System.out.println("checkReceivedUser bad, forward to signin");
            request.getRequestDispatcher("signin").forward(request, response);
        }
    }
}
