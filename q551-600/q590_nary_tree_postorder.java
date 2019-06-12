/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

    List<Integer> res = new LinkedList<>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return res;
    }

    private void helper(Node root) {
        if (root != null) {

            for (Node child : root.children) {
                helper(child);
            }
            res.add(root.val);
        }
    }
}
