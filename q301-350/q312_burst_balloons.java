class Solution {
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] ans = new int[n+2];
        ans[0] = 1;
        ans[n + 1] = 1;
        System.arraycopy(nums, 0, ans, 1, n);

        int[][] dp = new int[n + 2][n + 2];
        for (int[] a : dp) Arrays.fill(a, 0);

        //区间dp,dp[i][j]表示将内部烧完获得的最多硬币数目
        for (int i = n+1; i >= 0; i--) {
            for (int j = i+1; j < n+2; j++) {
                for (int k = i+1; k <= j-1; k++) {
                    dp[i][j] = Math.max(dp[i][j], ans[i] * ans[k] * ans[j] + dp[i][k] + dp[k][j]);
                }
            }
        }
        return dp[0][n+1];
    }
}
