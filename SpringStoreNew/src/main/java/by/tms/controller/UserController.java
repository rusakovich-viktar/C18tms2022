package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static by.tms.utils.Constants.Attributes.USERNAME;
import static by.tms.utils.Constants.Attributes.USER_DTO;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    public ModelAndView showUserProfile(@RequestParam("id") Long id,
                                        ModelAndView modelAndView) {
        UserDto newUserDto = userService.findUserDtoById(id);
        modelAndView.addObject("userDto", newUserDto);
        modelAndView.setViewName("profile");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView editUserProfileInfo(HttpSession session, ModelAndView modelAndView) {
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO);
        modelAndView.setViewName("edit-profile");
        modelAndView.addObject("userDto", userDto);
        return modelAndView;
    }

    @PostMapping("/profile")
    public ModelAndView updateProfile(@RequestParam("name") String name,
                                      @RequestParam("surname") String surname,
                                      @RequestParam("birthday") String birthday,
                                      @RequestParam("gender") String gender,
                                      @RequestParam("email") String email,
                                      ModelAndView modelAndView, HttpSession session) {
        UserDto userDto = (UserDto) session.getAttribute(USER_DTO);
        userDto.setName(name);
        userDto.setSurname(surname);
        userDto.setBirthday(birthday);
        userDto.setGender(gender);
        userDto.setEmail(email);
        userService.updateUser(userDto);
        modelAndView.setViewName("profile");
        session.setAttribute(USERNAME, userDto.getUsername());
        session.setAttribute(USER_DTO, userDto);
        return modelAndView;
    }

}