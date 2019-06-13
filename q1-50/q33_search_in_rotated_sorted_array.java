class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int low = 0;
        int high = nums.length - 1;
        int middle;
        while (low < high) {
            middle = (low + high) / 2;
            if (nums[middle] > nums[high]) low = middle + 1;
            else high = middle;
        }
        int rotated = low;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            middle = (low + high) / 2;
            int realMid = (middle + rotated) % nums.length;
            if (nums[realMid] == target) return realMid;
            else if (nums[realMid] < target) low = middle + 1;
            else high = middle - 1;
        }
        return -1;
    }
}
