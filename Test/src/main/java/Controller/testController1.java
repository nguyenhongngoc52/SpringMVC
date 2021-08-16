package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;


@Controller
public class testController1 {
    @RequestMapping("/testSession")
    public String testController(Model model , HttpSession session) {
//        String firstName = (String) model.getAttribute("firstName");
//        String newFisrtName = "MR" + Name;
//        model.addAttribute("firstName" , newFisrtName);
//        System.out.println("inside method :" + newFisrtName);
        String address =(String) session.getAttribute("address");
        String newAddress = "DAI AN " + address;
        model.addAttribute("address", newAddress);
        System.out.println(newAddress);
        session.invalidate();
        return "index";
    }
}
