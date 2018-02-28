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


    @RequestMapping("/user")
    public String privatePage(Model model) {
//        model.addAttribute("name", name);
        return "private";
    }

    @RequestMapping("/logic")
    public String errorMethod() {
        int a = 0;
        int b = 10/a;

        return "greeting";
    }

}
