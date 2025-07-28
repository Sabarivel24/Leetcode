/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prev points to node before the pair
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            // Nodes to be swapped
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two nodes ahead
            prev = first;
        }

        return dummy.next;
    }
}