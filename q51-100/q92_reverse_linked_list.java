/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy, end = dummy;
        for (int i = 1; i < m; i++) start = start.next;
        for (int i = 0; i <= n; i++) end = end.next;

        ListNode pre = end;
        ListNode curr = start.next;
        ListNode next = null;

        while (curr != end) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        start.next = pre;
        return dummy.next;
    }
}
