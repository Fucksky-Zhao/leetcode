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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode helper(int[] pre, int l1, int r1, int[] in, int l2, int r2) {
        if (l1 > r1 || l2 > r2) return null;
        if (l1 == r1 || l2 == r2) return new TreeNode(pre[r1]);
        TreeNode root = new TreeNode(pre[r1]);
        int i = l2;
        for (i = l2; i <= r2; i++) {
            if (in[i] == pre[r1]) break;
        }

        root.left = helper(pre, l1, i-1 - l2 + l1, in, l2, i-1);
        root.right = helper(pre, i-1 - l2 + l1 + 1, r1-1, in, i+1, r2);
        return root;
    }

}
