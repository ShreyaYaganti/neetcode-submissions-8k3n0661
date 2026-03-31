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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode node=dummy;
        ListNode p1=list1; ListNode p2=list2;
        while(p1!=null||p2!=null){
          
                if(p2==null||(p1!=null&&p1.val<p2.val)){
                    node.next=p1;
                    node=p1;
                    p1=p1.next;
                }
                else{
                    node.next=p2;
                    node=p2;
                    p2=p2.next;
                }
            
        }
        return dummy.next;

        
    }
}