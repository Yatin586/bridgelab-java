public class TitleCase {
    public static void main(String[] args) {
        String str = "java is awesome";
        String[] words = str.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1))
                         .append(" ");
            }
        }

        System.out.println(titleCase.toString().trim());  // Output: Java Is Awesome
    }
}
