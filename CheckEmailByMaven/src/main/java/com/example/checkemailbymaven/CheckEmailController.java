package com.example.checkemailbymaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CheckEmailController {
    @GetMapping("/checkEmail")
    public String checkEmail(@RequestParam String email, Model model) {
        boolean validateEmail = checkValidate(email);
        if (validateEmail) {
            model.addAttribute("result", "Hi " + email);
        } else {
            model.addAttribute("result", "is doesn't match email type");
        }
        return "index";
    }

    public boolean checkValidate(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    @GetMapping("/Email")
    public String showEmail() {
        return "index";
    }
}
