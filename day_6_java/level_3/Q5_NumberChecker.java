import java.util.Scanner;

public class Q5_NumberChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, n = num;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String nStr = String.valueOf(num);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(nStr);
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));

        sc.close();
    }
}
