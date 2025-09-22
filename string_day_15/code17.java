import java.util.*;
import java.util.regex.*;

public class ExtractIntegers {
    public static void main(String[] args) {
        String str = "abc123def45";
        List<Integer> numbers = new ArrayList<>();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);

        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }

        System.out.println(numbers);  // Output: [123, 45]
    }
}
