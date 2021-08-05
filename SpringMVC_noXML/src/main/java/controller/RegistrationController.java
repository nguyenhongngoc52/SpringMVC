package controller;

import API.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){
//        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
//        model.addAttribute("userReg",userRegistrationDTO);
        return "user-registration-page";
    }
    @RequestMapping("/registration-success")
    public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO){
        return "registration-sucess";
    }
}
