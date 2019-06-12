class Solution {
    public int[] countBits(int num) {
        int n = num;
        int[] dp = new int[n + 1];
        if (n == 0) return dp;
        dp[1] = 1;
        for (int k = 2; k <= n; k++) {
            dp[k] = dp[k >> 1] + (k & 1);//按位与优先级较低，需要加括号否则报错
        }
        return dp;
    }
}
