class Solution {
    public int findDuplicate(int[] nums) {
        int p = 0, q = 0;
        while (true) {
            p = nums[p];
            q = nums[nums[q]];
            if (p == q) break;
        }
        q = 0;
        while (p != q) {
            p = nums[p];
            q = nums[q];
        }
        return p;

    }
}
