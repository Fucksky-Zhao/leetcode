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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (findNode(root.left, p) && findNode(root.left, q)) return lowestCommonAncestor(root.left, p, q);
        else if (findNode(root.right, p) && findNode(root.right, q))
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    private boolean findNode(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;
        return findNode(root.left, p) || findNode(root.right, p);
    }
}
