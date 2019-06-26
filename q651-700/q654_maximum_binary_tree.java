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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l > r) return null;
        int currMax = Integer.MIN_VALUE, iMax = -1;
        for (int i = l; i <= r; i++) {
            currMax = (nums[i] >= currMax) ? nums[i] : currMax;
            iMax = (nums[i] >= currMax) ? i : iMax;
        }
        TreeNode root = new TreeNode(currMax);
        root.left = helper(nums, l, iMax-1);
        root.right = helper(nums, iMax+1, r);
        return root;
    }
}
