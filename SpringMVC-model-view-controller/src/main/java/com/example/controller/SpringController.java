package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
    @RequestMapping(value = "/cafe", method = RequestMethod.GET)
    public String hello(Model model) {
        String name = "nguyen Hong Ngoc";
        model.addAttribute("ngoc", name);
        return "welcome";
    }

}
