class Solution {
    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0) return;
        helper(nums, 0, nums.length - 1);
        helper(nums, 0, k % nums.length - 1);
        helper(nums, k % nums.length, nums.length - 1);
    }

    private void helper(int[] a, int i, int j) {
        for (int k = i; k <= (i+j)/2; k++) {
            int temp = a[k];
            a[k] = a[i+j-k];
            a[i+j-k] = temp;
        }
    }
}
