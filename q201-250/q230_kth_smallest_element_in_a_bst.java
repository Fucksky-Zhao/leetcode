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
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return res;
    }

    private void helper(TreeNode root, int k) {
        if (root != null) {
            helper(root.left, k);
            count++;
            if (count == k) {
                res = root.val;
                return;
            }
            helper(root.right, k);
        }
    }
}
