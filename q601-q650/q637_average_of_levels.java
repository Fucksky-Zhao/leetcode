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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            double sum = 0;
            for (int i = 0; i < cnt; i++) {
                TreeNode p = queue.poll();
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
                sum += p.val;
            }
            res.add(sum / cnt);
        }
        return res;

    }
}
