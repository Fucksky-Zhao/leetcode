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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high) return null;
        // if (low == high) return new TreeNode(nums[low]);

        int middle = (low+high)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = helper(nums, low, middle - 1);
        root.right = helper(nums, middle + 1, high);

        return root;
    }
}
