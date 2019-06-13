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
    Set<Integer> set = new HashSet<>();
    boolean flag;

    public boolean findTarget(TreeNode root, int k) {
        inOrder(root, k);
        return flag;
    }

    private void inOrder(TreeNode root, int k) {
        if (root != null) {
            inOrder(root.left, k);
            if (root.val <= k/2) set.add(root.val);
            else if (set.contains(k - root.val)) {
                flag = true;
            }
            inOrder(root.right, k);
        }
    }
}
