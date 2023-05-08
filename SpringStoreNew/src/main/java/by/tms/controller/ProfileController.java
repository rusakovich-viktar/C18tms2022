package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import static by.tms.utils.Utils.isUserLogIn;

@Controller
@RequiredArgsConstructor
public class ProfileController {

    @GetMapping("/profile")
    public ModelAndView showProfilePage(HttpServletRequest request, ModelAndView modelAndView) {
        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
        if (isUserLogIn(userDto)) {
            modelAndView.setViewName("profile");
        } else {
            modelAndView.setViewName("signin");
        }
        return modelAndView;
    }
}
