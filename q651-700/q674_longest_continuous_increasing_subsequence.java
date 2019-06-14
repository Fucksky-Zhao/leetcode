class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = (nums[i] > nums[i - 1]) ? dp[i - 1] + 1 : 1;
        }

        int res = 0;
        for (int j = 0; j < nums.length; j++) {
             res = Math.max(res, dp[j]);
        }
        return res;
    }
}
