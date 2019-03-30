class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currEnd = 0, currFathest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currFathest = Math.max(i + nums[i], currFathest);
            if (i == currEnd) {
                jumps++;
                //if (currFathest >= nums.length - 1) return jumps;
                currEnd = currFathest;
            }
        }
        return jumps;
    }





    public int jump2(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[nums.length];

        visited[0] = true;
        dist[0] = 0;
        queue.add(0);

        while (queue.size() != 0) {
            int k = queue.remove();

            if (k == nums.length - 1) return dist[k];
            for (int i = 1; i <= nums[k]; i++) {
                if (k + i >= nums.length - 1) return dist[k] + 1;
                if (!visited[k + i]) {
                    visited[k + i] = true;
                    dist[k + i] = dist[k] + 1;
                    queue.add(k + i);
                }
            }
        }

        return dist[nums.length - 1];
        // if (set.contains(nums.length - 1)) return true;
        // return false;
    }
}
