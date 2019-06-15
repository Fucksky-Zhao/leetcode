class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int start = -1, end = -1;
        int low = 0, high = nums.length - 1;
        int middle = (low + high) / 2;

        while (low <= high) {
            if (nums[middle] == target) {
                start = middle;
                high = middle - 1;
                middle = (low + high) / 2;
            } else if (nums[middle] < target) {
                low = middle + 1;
                middle = (low + high) / 2;
            } else {
                high = middle - 1;
                middle = (low + high) / 2;
            }
        }

        low = 0;
        high = nums.length - 1;
        middle = (low + high) / 2;
        while (low <= high) {
            if (nums[middle] == target) {
                end = middle;
                low = middle + 1;
                middle = (low + high) / 2;
            } else if (nums[middle] < target) {
                low = middle + 1;
                middle = (low + high) / 2;
            } else {
                high = middle - 1;
                middle = (low + high) / 2;
            }

        }
        return new int[]{start, end};
    }
}
