package controller;

import API.UserinfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {
    @RequestMapping("/")
    public String  homePage(@ModelAttribute("userInfo") UserinfoDTO userinfoDTO){
        return "home-page";
    }
    @RequestMapping("process-homepage")
    public String reSulthomePage(@ModelAttribute("userInfo") UserinfoDTO userinfoDTO){
        //write the value to the property by fatching from the url
//        System.out.println("userName is :" + userinfoDTO.getUserName());
//        System.out.println("crushName is :" + userinfoDTO.getCrushName());
//        model.addAttribute("userInfo" , userinfoDTO);
       // model.addAttribute("crushName" , crushName1);
        return"result-homepage";
    }

}
