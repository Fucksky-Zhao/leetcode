class NumArray {
    int[] dp;

    public NumArray(int[] nums) {
        int n = nums.length;
        this.dp = new int[n + 1];
        for (int k = 1; k <= n; k++) {
            this.dp[k] = this.dp[k - 1] + nums[k - 1];
        }
    }

    public int sumRange(int i, int j) {
        return this.dp[j + 1] - this.dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
