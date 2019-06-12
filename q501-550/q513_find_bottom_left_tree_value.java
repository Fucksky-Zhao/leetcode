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
    int res = 0;
    int h = 0;

    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return res;
    }

    public void helper(TreeNode root, int depth) {
        if (root != null) {
            if (depth > h) {
                h = depth;
                res = root.val;
            }
            helper(root.left, depth + 1);
            helper(root.right, depth + 1);
        }
    }

}
