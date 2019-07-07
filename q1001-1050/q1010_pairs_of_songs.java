class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int[] nums = new int[60];
        for (int i = 0; i < time.length; i++) {
            int k = time[i] % 60;
            nums[k]++;
        }

        for (int i = 1; i < 30; i++) {
            res += nums[i] * nums[60 - i];
        }
        res += nums[0] * (nums[0] - 1)/2 + nums[30] * (nums[30]-1)/2;

        return res;
    }
}
