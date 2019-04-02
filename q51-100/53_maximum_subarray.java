class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int[] sum = new int[n];
        sum[0] = nums[0];
        //dynamic programming. sum[i] denotes the sum of subarray ends at index i.
        for (int i = 1; i < n; i++) {
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
            result = Math.max(result, sum[i]);
        }
        return result;
    }
}
