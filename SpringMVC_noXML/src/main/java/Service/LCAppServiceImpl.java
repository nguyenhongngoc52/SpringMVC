package Service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {
    public final String LC_APP_FORMULA = "FLAME";

    @Override
    public String calculateLove(String userName, String crushName) {
        int count = (userName + crushName).toCharArray().length;
        int formula = LC_APP_FORMULA.length();
        int rem = count % formula;

        char resultChar = LC_APP_FORMULA.charAt(rem);
        String result = whatBetwwenUs(resultChar);
        return result;

    }

    @Override
    public String whatBetwwenUs(char calculatorResult) {
        String reSult = null;
        if (calculatorResult == 'F') {
            reSult = Constant.F_CHAR_MEANING;
        } else if (calculatorResult == 'L') {
            reSult = Constant.L_CHAR_MEANING;
        } else if (calculatorResult == 'A') {
            reSult =Constant.A_CHAR_MEANING;
        } else if (calculatorResult == 'M') {
            reSult =Constant.M_CHAR_MEANING;
        } else if (calculatorResult == 'E') {
            reSult =Constant.E_CHAR_MEANING;
        }
        return reSult;
    }
}
