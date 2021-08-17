package controller;

import API.EmailDTO;
import API.UserinfoDTO;
import Service.LCAppEmailService;
import Service.LCAppEmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class EmailController {
    @Autowired
    private LCAppEmailServiceImpl lcAppEmailService;

    @RequestMapping("/sendEmail")
    public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {

        return "send-email-page";
    }

    @RequestMapping("/process-email")
    public String processEmail(@SessionAttribute("userInfo") UserinfoDTO userinfoDTO, @ModelAttribute("emailDTO") EmailDTO emailDTO) {
        lcAppEmailService.sendEmail(userinfoDTO.getUserName(), emailDTO.getUserEmail(), "FRIEND");
        return "process-email-page";
    }


}
