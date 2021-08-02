package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerSugar {
    @RequestMapping("/sugar")
    @ResponseBody
    public String giveSugar(){
        return "OK...sugar";
    }

}
