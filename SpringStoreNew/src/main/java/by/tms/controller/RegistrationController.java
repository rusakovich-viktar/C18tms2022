package by.tms.controller;

import by.tms.model.User;
import by.tms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signup")
public class RegistrationController {

    private final UserService userService;

    @PostMapping()
    public String registerUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("repeatPass") String repeatPass,
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("date") String birthday,
            @RequestParam("gender") String gender,
            @RequestParam("email") String email,
            @RequestParam("registrationDate") String registrationDate,
            Model model
    ) {

        try {
            if (username == null || password == null || repeatPass == null || name == null || surname == null || birthday == null || gender == null || username.isEmpty() || password.isEmpty() || repeatPass.isEmpty() || name.isEmpty() || surname.isEmpty() || birthday.isEmpty() || gender.isEmpty()) {
                model.addAttribute("error", "Необходимо заполнить все поля формы.");
            } else if (password.length() < 8) {
                model.addAttribute("error", "Password must have minimum 8 characters.");
            } else {
                if (!password.equals(repeatPass)) {
                    model.addAttribute("error", "Passwords don't match.");
                    return "signup";
                }

                Pattern pattern = Pattern.compile(".+@.+\\..+");
                Matcher matcher = pattern.matcher(email);

                if (!matcher.matches()) {
                    model.addAttribute("error", "Некорректный формат email.");
                } else {
                    userService.addNewUser(new User(username, name, surname, gender, birthday, email, registrationDate, password));
                    return "redirect:/signin";
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            model.addAttribute("error", "Произошла ошибка при регистрации.");
        }

        return "signup";
    }

    @GetMapping()
    public String getRegistrationPage() {
        return "signup";
    }
}
