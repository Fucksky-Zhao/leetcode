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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        Set<Integer> set= new HashSet<Integer>();
        for (int item : to_delete) {
            set.add(item);
        }
        helper(set, res, root, true);
        return res;
    }

    private TreeNode helper(Set<Integer> set, List<TreeNode> res, TreeNode root, boolean isRoot) {
        if (root == null) return null;
        if (!set.contains(root.val) && isRoot) res.add(root);
        root.left = helper(set, res, root.left, set.contains(root.val)==true ? true : false);
        root.right = helper(set, res, root.right, set.contains(root.val)==true ? true : false);
        return set.contains(root.val)==true ? null : root;
    }
}
