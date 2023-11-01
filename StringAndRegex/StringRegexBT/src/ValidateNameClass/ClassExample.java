package ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String NAME_CLASS = "^[CAP]\\d{4,}[GHIK]$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
