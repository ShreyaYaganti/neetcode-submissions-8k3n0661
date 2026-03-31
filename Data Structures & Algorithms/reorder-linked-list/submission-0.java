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
    public void reorderList(ListNode head) {
        //find the mid point
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode secondhead = slow.next;
        slow.next = null;
        //Now reverse the second half of the list;
        ListNode prev = null;
        while(secondhead!=null){
            ListNode temp = secondhead;
            secondhead = secondhead.next;
            temp.next=prev;
            prev=temp;
        }
        ListNode p1 = head;
        ListNode p2=  prev;
        while(p2!=null){
            ListNode temp1 =p1;
            ListNode temp2 =p2;
            p1=p1.next;
            p2=p2.next;
            temp1.next=temp2;
            temp2.next=p1;
        }
        //return head;


    }
}
