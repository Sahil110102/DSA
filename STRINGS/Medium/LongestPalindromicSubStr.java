public class LongestPalindromicSubStr {
    public String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        String ans = "";

        for (int i = 1; i < s.length(); i++) {
            // for Odd Length
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)) {
                high++;
                low--;
                if (low == -1 || high == s.length()) {
                    break;
                }
            }

            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > ans.length()) {
                ans = palindrome;
            }

            // for Even Length
            low = i - 1;
            high = i;

            while (s.charAt(low) == s.charAt(high)) {
                high++;
                low--;
                if (low == -1 || high == s.length()) {
                    break;
                }
            }

            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > ans.length()) {
                ans = palindrome;
            }
        }

        return ans;
    }
}
