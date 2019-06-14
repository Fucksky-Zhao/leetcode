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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;//无论如何都不会返回null，最多返回空的list
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while ( !queue.isEmpty() ) {
            int cnt = queue.size();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode p = queue.poll();
                ans.add(p.val);
                if (p.left != null) queue.offer(p.left);
                if (p.right != null) queue.offer(p.right);
            }
            res.add(ans);
        }
        return res;
    }
}
