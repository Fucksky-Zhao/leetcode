class Solution {
    public int maxArea(int[] height) {
        // int n = height.length;
        // int[] dp = new int[n];
        // for (int i = 1; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         dp[i] = Math.max(dp[i], (i - j) * Math.min(height[i], height[j]));
        //     }
        // }
        // int res = 0;
        // for (int i = 1; i < n; i++) {
        //     res = Math.max(res, dp[i]);
        // }
        // return res;
        int n = height.length;
        int res = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            res = Math.max(res, (j-i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return res;
    }
}
