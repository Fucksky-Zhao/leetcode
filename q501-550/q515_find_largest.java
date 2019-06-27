/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int currMax = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                currMax = Math.max(currMax, p.val);
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
            }
            res.add(currMax);
        }
        return res;
    }
}
