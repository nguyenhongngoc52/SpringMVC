package formatter;

import API.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class phoneNumberFormatter implements Formatter<Phone> {


    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
        System.out.println("method using...");
        Phone phone = new Phone();
        // split the string received from the user
        String[] phoneNumber = completePhoneNumber.split("-");
        int index = completePhoneNumber.indexOf("-");
        if (index == -1||completePhoneNumber.startsWith("-")) {
            //neu ma sdt nhap vao o form khong co dung dinh dang thi tuy dong them ma vung la 91
            phone.setCountryCode("91");
            phone.setUserNumber(phoneNumber[0]);
        } else {
            phone.setCountryCode(phoneNumber[0]);
            phone.setUserNumber(phoneNumber[1]);
        }

        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        //load the saved user data from the database
        System.out.println("inside the print method od the PhoenNumber ");
        return phone.getCountryCode() + "-" + phone.getUserNumber();
    }
}
