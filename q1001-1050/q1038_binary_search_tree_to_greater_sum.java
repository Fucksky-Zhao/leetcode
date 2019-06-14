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
    int count = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        helper(root);
        return root;

    }

    private void helper(TreeNode root) {
        if (root != null) {
            helper(root.right);
            count += root.val;
            root.val = count;
            helper(root.left);
        }
    }
}
