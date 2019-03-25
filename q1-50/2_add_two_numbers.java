/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode sentinel = new ListNode(-1);
        ListNode q = sentinel;
        int newValue = 0, plus = 0;
        while (p1 != null || p2 != null) {
            int x1 = (p1 == null) ? 0 : p1.val;
            int x2 = (p2 == null) ? 0 : p2.val;
            newValue = (x1 + x2 + plus) % 10;
            plus = (x1 + x2 + plus) / 10;
            q.next = new ListNode(newValue);
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            q = q.next;
        }
        if (plus != 0) {
            q.next = new ListNode(plus);
        }
        return sentinel.next;
    }
}
