class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        List<Integer> item = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for (int num : nums) input.add(num);
        int n = nums.length;
        helper(input, item, res, n);
        return res;
    }

    private void helper(List<Integer> input, List<Integer> item, List<List<Integer>> res, int n) {
        if (item.size() == n) {
            res.add(new ArrayList<>(item));
            return;
        }
        for (int k : input) {
            if (item.contains(k)) continue;
            item.add(k);
            // System.out.print(item.toString());
            helper(input, item, res, n);
            item.remove(item.size()-1);
            // System.out.print(item.toString());
        }
    }
}
