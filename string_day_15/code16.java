public class CheckNumber {
    public static void main(String[] args) {
        String[] inputs = {"123", "12.34", "abc"};

        for (String str : inputs) {
            System.out.println(str + " → " + isNumber(str));
        }
    }

    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
