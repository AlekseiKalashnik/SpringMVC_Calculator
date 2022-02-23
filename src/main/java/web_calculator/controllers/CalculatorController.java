package web_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/")
    public String start() {
        return "calculator/startPage";
    }

    @GetMapping("/action")
    public String calculator(@RequestParam("firstNumber") double firstNumber, @RequestParam("secondNumber") double secondNumber,
                       @RequestParam("action") String action, Model model) {
        switch (action) {
            case("multiplication"):
                model.addAttribute("multiplication", "Result = " + (firstNumber*secondNumber));
                return "calculator/calculator";
            case("addition"):
                model.addAttribute("addition", "Result = " + (firstNumber+secondNumber));
                return "calculator/calculator";
            case("subtraction"):
                model.addAttribute("subtraction", "Result = " + (firstNumber-secondNumber));
                return "calculator/calculator";
            case("division"):
                model.addAttribute("division", "Result = " + (firstNumber/secondNumber));
                return "calculator/calculator";
        }
        return "calculator/calculator";
    }

    @GetMapping("/exit")
    public String exit() {
        return "calculator/exit";
    }
}
