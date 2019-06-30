class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        int sum = 0;
        for (int num : nums) {
            if (set.contains(num)) duplicate = num;
            else set.add(num);
            sum += num;
        }
        int[] res = new int[]{duplicate, n*(n+1)/2+duplicate-sum};
        return res;
    }
}
