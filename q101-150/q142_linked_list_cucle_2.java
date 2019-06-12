/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        if (p == null) return null;
        while (q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) break;
        }
        if (q.next == null || q.next.next == null) return null;
        q = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
