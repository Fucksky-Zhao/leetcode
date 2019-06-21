class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+2][n+2];
        for (int[] a : dp) Arrays.fill(a, Integer.MAX_VALUE);
        for (int i = 0; i <= n+1; i++) {
            for (int j = 0; j <= n+1; j++) {
                if (j <= i) dp[i][j] = 0;
            }
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.min(dp[i][j], k + Math.max(dp[i][k-1], dp[k+1][j]));
                }
            }
        }
        return dp[1][n];
    }
}
