package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements  LCAppEmailService{
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String userName ,String userEmail, String result) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(userEmail);
        mailMessage.setSubject("Love Calcuator Applicatiopn Result");
        mailMessage.setText("HI" + userName + "The result by the LCApp is" + result);
        javaMailSender.send(mailMessage);
    }
}
