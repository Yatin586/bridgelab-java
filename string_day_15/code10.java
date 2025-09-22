import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLength = 0;
        String longest = "";
        
        for (int i = 0; i < str.length(); i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);
                if (set.contains(c)) break;
                set.add(c);
                sb.append(c);
            }
            if (sb.length() > maxLength) {
                maxLength = sb.length();
                longest = sb.toString();
            }
        }

        System.out.println("Longest Substring: " + longest + " (Length: " + maxLength + ")");
    }
}
