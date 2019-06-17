/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head, curr = head.next;
        while (curr != null) {
            if (curr.val == pre.val) {
                pre.next = curr.next;
                curr = curr.next;
            } else {
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
