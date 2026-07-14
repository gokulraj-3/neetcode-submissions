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
        HashMap<Node,Node> hm = new HashMap<>();
        Node ans = null;
        Node itra = null;
        Node itr = head;
        while(itr != null) {
            if(ans == null) {
                ans = new Node(head.val);
                hm.put(head,ans);
                itra = ans;
            }
            if(itr.next != null) {
                if(hm.containsKey(itr.next)) {
                    itra.next = hm.get(itr.next);
                } else {
                    itra.next = new Node(itr.next.val);
                    hm.put(itr.next,itra.next);
                }
            }
            if(itr.random != null) {
                if(hm.containsKey(itr.random)) {
                    itra.random = hm.get(itr.random);
                } else {
                    itra.random = new Node(itr.random.val);
                    hm.put(itr.random,itra.random);
                }
            }
            itr = itr.next;
            itra = itra.next;
        }
        return ans;
    }
}
