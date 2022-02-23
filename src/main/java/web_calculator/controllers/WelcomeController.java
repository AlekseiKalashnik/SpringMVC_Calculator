package web_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class WelcomeController {

    @GetMapping()
    public String beginPage() {
        return "welcome_page/hello";
    }

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            Model model) {
        model.addAttribute("message", "Hello, " + name + " " + surname + "!");
        return "calculator/beginWorkWithCalculator";
    }
}
