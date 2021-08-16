package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"firstName" , "lastName"})
public class testController {
    @RequestMapping("/test1")
    public String test1(Model model, HttpServletRequest request){
        model.addAttribute("firstName","Nguyen");
        model.addAttribute("lastName","Ngoc");
        model.addAttribute("next","test2");
        HttpSession session = request.getSession();
        session.setAttribute("address","Ha Noi");
        return "index";
    }

    @RequestMapping("/test2")
    public String test2(Model model1 ){
        model1.addAttribute("next","test3");
        String fisrtName = (String)model1.getAttribute("firstName");
        System.out.println(fisrtName);
//        status.setComplete();
        return "index";
    }
    @RequestMapping("/test3")
    public String test3(Model model2 , HttpSession session , SessionStatus status){
        String lastName = (String)model2.getAttribute("lastName");
        System.out.println("test 3 request : " + lastName);
        model2.addAttribute("next","testSession");
        String Address = (String)session.getAttribute("address") + "Home sweet";
        model2.addAttribute("address" , Address);
        System.out.println("address" + Address);
        status.setComplete();
        return "index";
    }
}
