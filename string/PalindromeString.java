public class PalindromeString {
    public static void main(String[] args) {
        String str = "NooNt";
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not a Palindrome");
                System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
                return;
            }
        }
        System.out.println("Palindrome");
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
    }

    // Optimized function to find the longest palindromic substring using dynamic programming
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) dp[i][i] = true;

        // Check for substring of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        // Check for lengths greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLen = len;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
