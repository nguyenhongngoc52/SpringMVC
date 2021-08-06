package formatter;

import API.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class phoneNumberFormatter  implements Formatter<Phone> {


    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
