class Solution {
    public boolean canWinNim(int n) {
        //dynamic programming, won't work due to memory limits
        // if (n <= 3) return true;
        // boolean[] dp = new boolean[n + 1];
        // dp[1] = true;
        // dp[2] = true;
        // dp[3] = true;
        // for (int i = 4; i <= n; i++ ) {
        //     dp[i] = false;
        //     for(int j = i - 3; j < i; j++) {
        //         if (dp[j] == false) dp[i] = true;
        //     }
        // }
        // return dp[n];
        return (n & 3) > 0;
    }
}
