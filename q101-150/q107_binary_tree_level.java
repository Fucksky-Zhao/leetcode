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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> item = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                item.add(p.val);
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
            }
            res.addFirst(item);
        }
        return res;
    }
}
