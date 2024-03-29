package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Cart;
import by.tms.model.User;
import by.tms.service.UserService;
import by.tms.utils.Constants;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static by.tms.utils.Constants.Attributes.CART;
import static by.tms.utils.Constants.Attributes.USER_DTO;
import static by.tms.utils.Constants.RequestParams.PASSWORD;

@RequiredArgsConstructor
@Controller
public class AuthController {

    private final UserService userService;

    @GetMapping("/signin")
    public String getLoginPage() {
        return "signin";
    }

    @PostMapping("/signin")
    public ModelAndView loginHomePageFromForm(@RequestParam(Constants.RequestParams.USERNAME) String username,
                                              @RequestParam(PASSWORD) String pass,
                                              HttpSession session, ModelAndView modelAndView) {
        User user = userService.getUserByLoginAndPassword(username, pass);
        if (user != null) {
            UserDto userDto = new UserDto(user.getId(), user.getUsername(), user.getName(), user.getSurname(), user.getGender(), user.getBirthday(), user.getEmail(), user.getRegistrationDate());
            Cart cart = new Cart();
            session.setAttribute(CART, cart);
            session.setAttribute(Constants.Attributes.USERNAME, username);
            session.setAttribute(USER_DTO, userDto);
            modelAndView.setViewName("redirect:/home");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "signin";
    }

}