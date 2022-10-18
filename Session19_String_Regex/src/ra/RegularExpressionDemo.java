package ra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        //Su dung String.matches() de so khop chuoi voi pattern --> Thuong dung
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String email = "quangnd@rikkeisoft.com";
        System.out.println(email.matches(emailPattern));
        //Su dung Pattern, Matcher cua java.util.regex
        String emailQuangND = "quangnd84@gmail.com";
        //-Tao doi tuong pattern
        Pattern pattern = Pattern.compile(emailPattern);
        //-Tao doi tuong matcher
        Matcher matcher = pattern.matcher(emailQuangND);
        //-So khop chuoi emailQuangND voi pattern
        System.out.println(matcher.matches());
    }
}
