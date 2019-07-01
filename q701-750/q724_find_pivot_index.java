class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int[] s = new int[nums.length + 1];
        s[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            s[i] = s[i-1] + nums[i-1];
        }
        for (int j = 0; j < nums.length; j++) {
            if (s[j] == s[nums.length] - s[j+1]) return j;
        }
        return -1;
    }
}
