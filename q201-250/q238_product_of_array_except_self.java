class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if (nums == null || nums.length == 0) return res;
        int product = 1;
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            product = product * nums[i-1];
            res[i] = product;
        }
        product = 1;
        for (int i = n-2; i >= 0; i--) {
            product = product * nums[i+1];
            res[i] = res[i] * product;
        }
        return res;
    }
}
