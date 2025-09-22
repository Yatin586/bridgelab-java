import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "someone@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        System.out.println(matcher.matches());  // Output: true
    }
}

