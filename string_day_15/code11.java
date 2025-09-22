public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "babad";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String odd = expand(str, i, i);
            String even = expand(str, i, i + 1);
            String maxStr = odd.length() > even.length() ? odd : even;
            if (maxStr.length() > longest.length()) {
                longest = maxStr;
            }
        }

        System.out.println(longest);  // Output: "bab" or "aba"
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

