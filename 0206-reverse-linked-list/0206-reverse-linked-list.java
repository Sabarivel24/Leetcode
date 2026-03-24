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
    public ListNode reverseList(ListNode head) {
        ListNode s=head;
       List<Integer>list=new ArrayList<>();
       while(s!=null){
        list.add(s.val);
        s=s.next;
       }
       Collections.reverse(list);
       ListNode h1=null;
       ListNode tail=null;
       for(int i:list){
        ListNode n=new ListNode(i);
        if(h1==null){
            h1=n;
            tail=n;
        }
        else{
          tail.next=n;
          tail=n;
        }
       }
       return h1;
    }
}