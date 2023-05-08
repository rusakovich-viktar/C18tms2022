package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.model.Cart;
import by.tms.model.User;
import by.tms.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static by.tms.model.RequestParam.PASSWORD;
import static by.tms.model.RequestParam.USERNAME;

@RequiredArgsConstructor
@Controller
public class AuthController {

    private final UserService userService;

    @GetMapping("/signin")
    public String loginPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public String loginPage(HttpSession session, HttpServletRequest request) {

        String username = request.getParameter(USERNAME.getValue());
        String pass = request.getParameter(PASSWORD.getValue());
//        try {
//            validateParamNotNull(username);
//            validateParamNotNull(pass);
//        } catch (RequestParamNullException ex) {
//            System.out.println(ex.getMessage());
//        }
//        PagesPath path;
        User user = userService.getUserByLoginAndPassword(username, pass);
        if (user != null) {
//            HttpSession session = request.getSession();
            UserDto userDto = new UserDto(user.getUsername(), user.getName(), user.getSurname(), user.getGender(), user.getBirthday(), user.getEmail(), user.getRegistrationDate());
            Cart cart = new Cart();
            session.setAttribute(Attribute.CART.getAttribute(), cart);
            session.setAttribute(Attribute.USERNAME.getAttribute(), username);
            session.setAttribute(Attribute.USER_DTO.getAttribute(), userDto);
            return "redirect:/eshop";
        } else {
            return "signin";
        }
//        return path;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpSession session) throws Exception {
        session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "signin";
    }

}