class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        max[0] = nums[0];
        min[0] = nums[0];
        int currMax = max[0];
        // int currMin = min[0];

        for (int i = 1; i < n; i++) {
            max[i] = Math.max(Math.max(nums[i] * max[i - 1], nums[i] * min[i - 1]), nums[i]);
            min[i] = Math.min(Math.min(nums[i] * max[i - 1], nums[i] * min[i - 1]), nums[i]);
            currMax = Math.max(currMax, max[i]);
        }

        return currMax;
    }
}
