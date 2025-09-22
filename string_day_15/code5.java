public class RemoveChars {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "lod";

        StringBuilder result = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) == -1) {
                result.append(c);
            }
        }

        System.out.println(result.toString());  // Output: he wr
    }
}
