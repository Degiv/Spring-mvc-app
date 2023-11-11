package com.degiv.springmvcwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(method = RequestMethod.GET, value = "/")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
