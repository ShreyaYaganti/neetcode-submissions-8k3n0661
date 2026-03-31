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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for(int i=0;i<lists.length;i++){
            result = mergeLists(result,lists[i]);
        }
        return result;

    }

    public ListNode mergeLists(ListNode list1 , ListNode list2){
        ListNode dummy = new ListNode();
        ListNode node = dummy;
        while(list1!=null||list2!=null){
             if(list1!=null&&list2!=null){
                 if(list1.val<list2.val){
                    node.next=list1;
                    node=list1;
                    list1=list1.next;
                 }
                 else{
                    node.next=list2;
                    node=list2;
                    list2=list2.next;
                 }
             }
             else if(list1!=null){
                 node.next=list1;
                    node=list1;
                    list1=list1.next;
             }
             else{
                node.next=list2;
                    node=list2;
                    list2=list2.next;
             }
        }
        return dummy.next;
    }
}
