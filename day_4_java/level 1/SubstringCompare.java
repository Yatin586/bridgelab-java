import java.util.Scanner;

public class SubstringCompare {
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = substringUsingCharAt(text, start, end);

        String builtInSub = text.substring(start, end);


        boolean isSame = manualSub.equals(builtInSub);

        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Both substrings are equal? " + isSame);
    }
}

