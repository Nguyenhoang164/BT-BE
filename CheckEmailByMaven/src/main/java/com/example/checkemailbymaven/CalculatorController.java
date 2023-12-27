package com.example.checkemailbymaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/showCaculator")
    public String showForm() {
        return "Caculator.jsp";
    }

    @RequestMapping("/check")
    public String showAnswer(@RequestParam String option, @RequestParam int number1, @RequestParam int number2, Model model) {
        switch (option) {
            case "+":
                model.addAttribute("result", number1 + number2);
                break;
            case "-":
                model.addAttribute("result", number1 - number2);
                break;
            case "x":
                model.addAttribute("result", number1 * number2);
                break;
            case "/":
                model.addAttribute("result", number1 / number2);
                break;

        }
        return "Caculator";
    }
}
