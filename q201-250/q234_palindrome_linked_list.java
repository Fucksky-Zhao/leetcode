/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode ref;

    public boolean isPalindrome(ListNode head) {
        ref = head;
        return check(ref);
    }

    private boolean check(ListNode node) {
        if (node == null) return true;
        boolean ans = check(node.next);
        boolean res = (ref.val == node.val) ? true : false;
        ref = ref.next;
        return ans && res;
    }
}
