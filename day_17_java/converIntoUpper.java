package lambdaEx;
import java.util.*;
import java.util.stream.*;

public class converIntoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("dhani", "riya", "karan");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

	}

}
