class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> ansMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int item = entry.getKey();
            int fre = entry.getValue();
            if (!ansMap.containsKey(fre)) {
                List<Integer> itemList = new LinkedList<>();
                itemList.add(item);
                ansMap.put(fre, itemList);
            } else {
                ansMap.get(fre).add(item);
            }
        }
        List<Integer> res = new LinkedList<>();

        while (res.size() < k) {
            Map.Entry<Integer, List<Integer>> entry = ansMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }
}
