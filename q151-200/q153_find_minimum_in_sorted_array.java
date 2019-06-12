class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int middle = (low + high) / 2;
        int n = nums.length;

        while (low <= high) {
            if (nums[low] < nums[high]) return nums[low];

            if (nums[middle] >= nums[low]) {
                low = middle + 1;
                middle = (low + high) / 2;
            } else {
                high = middle;
                middle = (low + high) / 2;
            }
        }
        return nums[middle];


    }
}
