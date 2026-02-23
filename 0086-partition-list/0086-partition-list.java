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
    public ListNode partition(ListNode head, int x) {
        ListNode LD=new ListNode(-1);
        ListNode GD=new ListNode(-1);
        ListNode less=LD;
        ListNode greater=GD;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                less.next=curr;
                less=less.next;
            }
            else{
                greater.next=curr;
                greater=greater.next;
            }
            curr=curr.next;
        }
        greater.next=null;
        less.next=GD.next;
        return LD.next;
    }
}