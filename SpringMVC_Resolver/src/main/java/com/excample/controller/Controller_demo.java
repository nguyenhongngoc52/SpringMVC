package com.excample.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_demo {
    @RequestMapping("/demo")
    public String view(){
        return "ngoc";
    }
}
