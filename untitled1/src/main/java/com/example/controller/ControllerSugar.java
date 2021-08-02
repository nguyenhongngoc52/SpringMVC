package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/SugarController")
public class ControllerSugar {
    @RequestMapping("/sugar")
    @ResponseBody
    public String giveSugar(){
        return "OK...sugar";
    }

    @RequestMapping("/noSalt")
    @ResponseBody
    public String giveSlat()
    {
        return " khong co";
    }

}
