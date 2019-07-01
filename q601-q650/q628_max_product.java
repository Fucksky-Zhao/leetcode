class Solution {
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n-1],
                        nums[n-1] * nums[n-2] * nums[n-3]);
    }
}
