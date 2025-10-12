import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateFormatterDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default format: " + today);
        System.out.println("DD-MM-YYYY: " + DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println("Month DD, YYYY: " + DateUtils.formatDate(today, "MMMM dd, yyyy"));
        System.out.println("YYYY/MM/DD: " + DateUtils.formatDate(today, "yyyy/MM/dd"));
    }
}
