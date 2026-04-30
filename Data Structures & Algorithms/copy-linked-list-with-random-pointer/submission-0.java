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
        HashMap<Node, Node> hs = new HashMap<>();
        hs.put(null,null);
        Node itr = head;
        while(itr!=null) {
            if (!hs.containsKey(itr)) {
                hs.put(itr,new Node(0));
            }
            hs.get(itr).val = itr.val;

            if(!hs.containsKey(itr.next)) {
                hs.put(itr.next,new Node(0));
            }
            hs.get(itr).next = hs.get(itr.next);

            if(!hs.containsKey(itr.random)) {
                hs.put(itr.random,new Node(0));
            }
            hs.get(itr).random = hs.get(itr.random);
            itr = itr.next;
        }
        return hs.get(head);

    }
}
