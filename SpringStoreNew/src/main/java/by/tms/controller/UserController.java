package by.tms.controller;

import by.tms.dto.UserDto;
import by.tms.model.Attribute;
import by.tms.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

//    @GetMapping("/profile")
//    public ModelAndView showProfilePage(HttpServletRequest request, ModelAndView modelAndView) {
//        HttpSession session = request.getSession();
//        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
//        if (isUserLogIn(userDto)) {
//            modelAndView.setViewName("profile");
//        } else {
//            modelAndView.setViewName("signin");
//        }
//        return modelAndView;
//    }

    @GetMapping("/profile")
    public ModelAndView showUserProfile(HttpSession session, @RequestParam("id") Long id,
                                        ModelAndView modelAndView) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Long id = auth.getName();
        UserDto newUserDto = userService.findUserDtoById(id);
        modelAndView.addObject("userDto", newUserDto);
        modelAndView.setViewName("profile");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView editUserProfileInfo(HttpSession session, ModelAndView modelAndView) {
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
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
//                                      @RequestParam("id") Long id,
//                                      @RequestParam("username") String username,
//                                      @RequestParam("registrationDate") String registrationDate,
                                      ModelAndView modelAndView, HttpSession session) {
        UserDto userDto = (UserDto) session.getAttribute(Attribute.USER_DTO.getAttribute());
//        UserDto userDto = new UserDto(id, username, name, surname, gender, birthday, email, registrationDate);
        userDto.setName(name);
        userDto.setSurname(surname);
        userDto.setBirthday(birthday);
        userDto.setGender(gender);
        userDto.setEmail(email);
        userService.updateUser(userDto);
        modelAndView.setViewName("profile");
        session.setAttribute(Attribute.USERNAME.getAttribute(), userDto.getUsername());
        session.setAttribute(Attribute.USER_DTO.getAttribute(), userDto);
        return modelAndView;
    }

}