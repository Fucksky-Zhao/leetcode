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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            LinkedList<Integer> item = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                if ((level & 1) == 1) item.add(p.val);
                else item.addFirst(p.val);
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
            }
            res.add(item);
        }
        return res;
    }
}
