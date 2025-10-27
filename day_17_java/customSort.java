package lambdaEx;
import java.util.*;
class Product {
    String name;
    int price;

    Product(String n, int p) {
        name = n;
        price = p;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}


public class customSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 15000));
        list.add(new Product("Laptop", 55000));
        list.add(new Product("Headphones", 2000));

        // Sort using lambda (by price)
        list.sort((a, b) -> a.price - b.price);

        for (Product p : list)
            System.out.println(p);

	}

}
