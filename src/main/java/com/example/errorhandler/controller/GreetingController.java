package com.example.errorhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    // private page
    @RequestMapping("/user")
    public String user() {
        return "user";
    }

    // private page
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    // do some logic and throw ArithmeticException
    @RequestMapping("/logic")
    public String errorMethod() {
        int a = 0;
        int b = 10/a;

        return "greeting";
    }

    // error pages ------------------start

    @RequestMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }

    @RequestMapping("/arithmetic-exception")
    public String arithmeticException() {
        return "arithmetic-exception";
    }

    // ------------------------------end

}
