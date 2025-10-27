package lambdaEx;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String t) {
        type = t;
    }

    public String toString() {
        return type + " Alert";
    }
}


public class notificationFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alert> alerts = Arrays.asList(
	            new Alert("Critical"),
	            new Alert("Normal"),
	            new Alert("Emergency")
	        );

	        Predicate<Alert> isCritical = a -> a.type.equals("Critical");

	        for (Alert a : alerts) {
	            if (isCritical.test(a))
	                System.out.println(a);
	        }

	}

}
