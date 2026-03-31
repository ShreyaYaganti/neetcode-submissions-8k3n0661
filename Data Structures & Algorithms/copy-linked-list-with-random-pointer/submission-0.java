/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node ,Node>oldToNew = new HashMap<>();
        Node dummy = new Node(0);
        Node p1 = head;
        Node pNew = dummy;
        while(p1!=null){
            Node curr;
            if(oldToNew.containsKey(p1)){
                curr = oldToNew.get(p1);
            }
            else{
                curr = new Node(p1.val);
                oldToNew.put(p1,curr);
            }
            pNew.next = curr;
            pNew =curr;
            Node random = p1.random;
            if(random==null){
                pNew.random=null;
            }
            else if(oldToNew.containsKey(random)){
                pNew.random = oldToNew.get(random);
            }
            else{
                pNew.random = new Node(random.val);
                oldToNew.put(random,pNew.random);
            }
            p1=p1.next;

        }
        return dummy.next;
        
    }
}
