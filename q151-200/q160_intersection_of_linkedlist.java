/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p = headA, q = headB;
        boolean flag = false;
        while (p != q) {
            if (p.next == null && flag) return null;
            if (p.next != null) p = p.next;
            else {
                p = headB;
                flag = true;
            }
            if (q.next != null) q = q.next;
            else q = headA;
        }
        return p;
    }
}
