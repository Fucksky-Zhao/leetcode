class Solution {
    public int integerReplacement(int n) {
        // if (n == 1) return 0;
        // int[] dp = new int[n/2 + 2];
        // dp[1] = 0;
        // for (int k = 2; k <= n/2 + 1; k++) {
        //     if (k % 2 == 0) {
        //         dp[k] = dp[k/2] + 1;
        //     } else {
        //         dp[k] = Math.min(dp[k/2], dp[k/2 + 1]) + 2;
        //     }
        // }
        // int res;
        // if (n % 2 == 0) res = dp[n/2] + 1;
        // else {
        //     res = Math.min(dp[n/2], dp[n/2 + 1]) + 2;
        // }
        // return res;

        if(n == 1){return 0;}
        if(n == Integer.MAX_VALUE){
            n--;
            return integerReplacement(n);
        }
        if(n%2 == 0){
            n = n/2;
            return 1+integerReplacement(n);
        }
        if(n%2 != 0){
            return 1+Math.min(integerReplacement(n+1), integerReplacement(n-1));
        }
        return -1;
    }
}
