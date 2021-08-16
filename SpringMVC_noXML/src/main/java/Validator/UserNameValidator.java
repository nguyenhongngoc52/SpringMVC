package Validator;

import API.UserRegistrationDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserNameValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return UserRegistrationDTO.class.equals(aClass);
    }


    @Override
    public void validate(Object o, Errors errors) {
        //to check if the field is null
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","userName.empty","User Name can not be empty");
        //the string should contain a "_"
        String userName = ((UserRegistrationDTO)o).getUserName();
        if(!userName.contains("_")){
            errors.rejectValue("userName","userName.invalidString","String must contain a '_'");
        }
    }
}
