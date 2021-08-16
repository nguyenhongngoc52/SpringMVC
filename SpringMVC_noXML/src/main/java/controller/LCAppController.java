package controller;

import API.UserinfoDTO;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {
    @RequestMapping("/")
    public String  homePage( Model model){
//        Cookie[] cookies = request.getCookies();
//        for (Cookie i:cookies){
//            if("lcApp.userName".equals(i.getName())){
//                String myUserName = i.getValue();
//                userinfoDTO.setUserName(myUserName);
//            }
//        }
        model.addAttribute("userInfo",new UserinfoDTO());
        return "home-page";
    }
    @RequestMapping("/process-homepage")
    public String reSulthomePage(@Valid  @ModelAttribute("userInfo") UserinfoDTO userinfoDTO , BindingResult result , HttpServletResponse response){
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
        //create a cookie for the user name
        Cookie theCookie = new Cookie("lcApp.userName",userinfoDTO.getUserName());
        theCookie.setMaxAge(60*60*24);
        //add the cookie to the respone
        response.addCookie(theCookie);
        //write service

        return"result-homepage";
    }

}
