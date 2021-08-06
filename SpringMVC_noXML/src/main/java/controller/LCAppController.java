package controller;

import API.UserinfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LCAppController {
    @RequestMapping("/")
    public String  homePage(@ModelAttribute("userInfo") UserinfoDTO userinfoDTO){
        return "home-page";
    }
    @RequestMapping("process-homepage")
    public String reSulthomePage(@Valid  @ModelAttribute("userInfo") UserinfoDTO userinfoDTO , BindingResult result ){
        //write the value to the property by fatching from the url
//        System.out.println("userName is :" + userinfoDTO.getUserName());
//        System.out.println("crushName is :" + userinfoDTO.getCrushName());
//        model.addAttribute("userInfo" , userinfoDTO);
       // model.addAttribute("crushName" , crushName1);
        System.out.println(userinfoDTO.isTermAndCondition());
        if(result .hasErrors()){
            System.out.println("my form has errors...");
            List<ObjectError> errors =result.getAllErrors();
            for(ObjectError i:errors){
                System.out.println(i);
            }
            return"home-page";
        }
        return"result-homepage";
    }

}
