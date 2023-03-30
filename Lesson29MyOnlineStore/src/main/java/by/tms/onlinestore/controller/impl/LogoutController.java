package by.tms.onlinestore.controller.impl;

import by.tms.onlinestore.controller.BaseCommandController;
import by.tms.onlinestore.model.PagesPath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static by.tms.onlinestore.model.PagesPath.SIGN_IN_PAGE;

public class LogoutController implements BaseCommandController {

    @Override
    public PagesPath execute(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return SIGN_IN_PAGE;
    }
}

