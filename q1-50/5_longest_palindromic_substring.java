class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        boolean[][] dp = new boolean[n][n];
        int count = 1, start = 0;//count denotes length of substring
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i+1] = true;
                count = 2;
                start = i;
            }
        }

        for (int i = n-2; i >= 0; i--) {
            for (int j = i + 2; j < n; j++) {
                if (dp[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (j - i + 1 > count) {
                        count = j - i + 1;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + count);
    }

}
