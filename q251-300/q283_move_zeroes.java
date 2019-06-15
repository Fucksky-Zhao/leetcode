class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && j == -1) j = i;//找到第一个0
            else if (nums[i] != 0 && j >= 0) {//存在零而且当前访问的值非零
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
        }
    }
}
