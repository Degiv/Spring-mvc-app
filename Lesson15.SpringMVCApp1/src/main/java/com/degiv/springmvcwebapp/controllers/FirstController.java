package com.degiv.springmvcwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
@RequestMapping(method = RequestMethod.GET, value = "/")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String action,
                            Model model) {

        int result = 0;
        if (action.equals("addition")) {
            result = a + b;
        } else if (action.equals("subtraction")) {
            result = a - b;
        } else if (action.equals("division")) {
            result = a / b;
        } else if (action.equals("multiplication")) {
            result = a * b;
        } else {
            result = -1;
        }

        model.addAttribute("message", "Result is " + Integer.toString(result));
        return "first/calculate";
    }
}
