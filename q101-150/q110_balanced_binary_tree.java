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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(helper(root.left) - helper(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int helper(TreeNode root) {
        if (root == null) return 0;
        return Math.max(helper(root.left), helper(root.right)) + 1;
    }
}
