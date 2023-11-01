package ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_PHONE = "^\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
