package main.infrastructure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationStrategy implements MembershipApplication {
    private final String email;
    boolean itMatches;
    Matcher matcher;
    public EmailValidationStrategy(String email){
        this.email = email;
    }
    public static boolean isEmailAddress(String email){
        Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    @Override
    public Boolean verifyApplication() {
        if(isEmailAddress(this.email)){
            return true;
        }
        return false;
    }
}
