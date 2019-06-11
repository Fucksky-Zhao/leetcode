class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int expected = n * (n + 1) / 2;
        // int real = 0;
        // for (int i = 0; i < n; i++) {
        //     real += nums[i];
        // }
        // return expected - real;

        int res = nums.length;
        for (int i = 0; i < nums.length; i ++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
}
