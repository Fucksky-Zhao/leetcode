class Solution {
    public static int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) dp[i] = Integer.MAX_VALUE - 1;
        return helper(coins, amount);
    }

    public int helper(int[] coins, int amount) {
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        if (dp[amount] < Integer.MAX_VALUE - 1) return dp[amount];
        return -1;
    }
}
