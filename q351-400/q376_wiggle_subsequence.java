class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        int[] dp1 = new int[n];
        dp[0] = 1;
        dp1[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            dp1[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp1[j] + 1);
                if (nums[i] < nums[j]) dp1[i] = Math.max(dp1[i], dp[j] + 1);
            }
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, Math.max(dp[i], dp1[i]));
        }
        return res;
    }
}
