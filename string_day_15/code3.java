public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "aaabbc";
        String encoded = "";
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                encoded += input.charAt(i) + String.valueOf(count);
                count = 1;
            }
        }

        System.out.println(encoded);  // Output: a3b2c1
    }
}
