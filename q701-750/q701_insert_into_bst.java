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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        root.left = root.val < val ? root.left : insertIntoBST(root.left, val);
        root.right = root.val < val ? insertIntoBST(root.right, val) : root.right;
        return root;
    }
}
