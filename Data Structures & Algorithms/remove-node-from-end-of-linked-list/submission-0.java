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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length =0;
        ListNode p1=head;
        while(p1!=null){
            p1=p1.next;
            length++;
        }
        int pos = length-n+1;
        p1=head;
        ListNode prev=null;
        while(p1!=null&&pos!=1){
            prev=p1;
            p1=p1.next;
            pos--; 
        }
        if(p1==head){
            return p1.next;
        }
        if(p1!=null){
            prev.next=p1.next;
        }
        return head;



    }
}
