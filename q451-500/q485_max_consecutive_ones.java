class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int cnt = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt = 0;
            } else {
                cnt++;
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}
