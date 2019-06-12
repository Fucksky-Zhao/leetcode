class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 1;
        int temp;
        for (int i = 0 ; i < n; i ++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                //swap(nums[i], nums[nums[i] - 1]);
                int j = nums[i] - 1;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for (int i = 0; i < n; i ++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
