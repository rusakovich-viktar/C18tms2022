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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static by.tms.utils.Constants.RequestParams.USERNAME;

@RequiredArgsConstructor
@Controller
public class AuthController {

    private final UserService userService;

    @GetMapping("/signin")
    public String getLoginPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public ModelAndView loginHomePageFromForm(@RequestParam(USERNAME) String username,
                                              @RequestParam("password") String pass,
                                              HttpSession session, ModelAndView modelAndView) {

        User user = userService.getUserByLoginAndPassword(username, pass);
        if (user != null) {
//            HttpSession session = request.getSession();
            UserDto userDto = new UserDto(user.getId(), user.getUsername(), user.getName(), user.getSurname(), user.getGender(), user.getBirthday(), user.getEmail(), user.getRegistrationDate());
            Cart cart = new Cart();
            session.setAttribute(Attribute.CART.getAttribute(), cart);
            session.setAttribute(Attribute.USERNAME.getAttribute(), username);
            session.setAttribute(Attribute.USER_DTO.getAttribute(), userDto);
            modelAndView.setViewName("redirect:/home");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
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