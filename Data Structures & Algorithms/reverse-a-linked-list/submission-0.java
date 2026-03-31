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
        ListNode p1 =head;
	ListNode prev=null;
	while(p1!=null){
	 ListNode temp =p1;
	 p1=p1.next;
	 temp.next=prev;
	 prev=temp;
     //System.out.println(p1.val+" "+temp.val+" "+prev.val);
	}
	return prev;
    }
}
