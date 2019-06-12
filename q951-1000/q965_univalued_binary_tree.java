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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return helper(root, root.val);
    }

    public boolean helper(TreeNode root, int x) {
        if (root == null) return true;
        if (root.val != x) return false;
        return helper(root.left, x) && helper(root.right, x);
    }
}
