class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes == null || dominoes.length <= 1) return 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] a : dominoes) {
            int item = Math.min(a[0], a[1]) * 10 + Math.max(a[0], a[1]);
            if (map.containsKey(item)) map.put(item, map.get(item) + 1);
            else map.put(item, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res += entry.getValue() * (entry.getValue() - 1) / 2;
        }
        return res;
    }
}
