package lambdaEx;
import java.util.*;
import java.util.function.Function;

class Bill {
    String transactionId;

    Bill(String id) {
        transactionId = id;
    }

    void show() {
        System.out.println("Bill generated for Transaction ID: " + transactionId);
    }
}

public class invoiceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> transactionIds = Arrays.asList("TXN201", "TXN202", "TXN203");

        // Constructor reference
        Function<String, Bill> createBill = Bill::new;

        for (String id : transactionIds) {
            Bill bill = createBill.apply(id);
            bill.show();
        }
	}

}
