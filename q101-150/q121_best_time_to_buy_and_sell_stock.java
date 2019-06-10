class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int[] dp = new int[n];
        // for (int i = 1; i < n; i++) {
        //     dp[i] = Math.max(dp[i-1] + prices[i] - prices[i-1], 0);
        // }
        // int res = 0;
        // for (int i = 0; i < n; i++) {
        //     res = Math.max(res, dp[i]);
        // }
        // return res;

        int n = prices.length;
        int pre = 0;
        int cur;
        int curMax = 0;
        for (int i = 1; i < n; i++) {
            cur = Math.max(pre + prices[i] - prices[i-1], 0);
            pre = cur;
            curMax = Math.max(cur, curMax);
        }
        return curMax;
    }
}
