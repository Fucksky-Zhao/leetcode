class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length - 1 && i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
        }
        return (reach >= nums.length - 1);
    }

    public boolean canJump2(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        set.add(0);//visit the node, put it in the set
        queue.add(0);

        while (queue.size() != 0) {
            int k = queue.remove();
            if (k == nums.length - 1) return true;
            for (int i = 1; i <= nums[k]; i++) {
                if (k + i >= nums.length - 1) return true;
                if (!visited[k + i]) {
                    visited[k + i] = true;
                    set.add(k + i);
                    queue.add(k + i);
                }
            }
        }

        if (set.contains(nums.length - 1)) return true;
        return false;
    }
}
