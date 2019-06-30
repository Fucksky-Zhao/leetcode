class Solution {
    public int minFallingPathSum(int[][] A) {
        if (A == null || A.length == 0) return 0;
        int n = A.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) dp[n-1][i] = A[n-1][i];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int temp = Integer.MAX_VALUE;
                for (int k = j - 1; k <= j+1; k++) {
                    if (k < 0 || k>= n) continue;
                    temp = Math.min(temp, dp[i+1][k]);
                }
                dp[i][j] = A[i][j] + temp;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) res = Math.min(res, dp[0][i]);
        return res;
    }
}
