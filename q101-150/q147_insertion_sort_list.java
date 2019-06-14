/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            ListNode pos = dummy;
            while (pos.next != null && pos.next.val < curr.val) {
                pos = pos.next;
            }
            curr.next = pos.next;
            pos.next = curr;
            curr = next;
        }

        return dummy.next;
    }
}
