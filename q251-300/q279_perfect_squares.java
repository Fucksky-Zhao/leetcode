class Solution {
    public int numSquares(int n) {
        if (n <= 0) return 0;
        int m = (int) Math.sqrt(n);
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= n; i++) dp[1][i] = i;
        for (int i = 1; i <= m; i++) dp[i][1] = 1;

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = (j >= i * i) ? Math.min(1+dp[i][j-i*i], dp[i-1][j]) : dp[i-1][j];
            }
        }
        return dp[m][n];
    }
}
