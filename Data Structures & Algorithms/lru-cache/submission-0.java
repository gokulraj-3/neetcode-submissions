public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    Node end;
    Node head;
    int cap;
    HashMap<Integer,Node> hs;

    public LRUCache(int capacity) {
        this.hs = new HashMap<>();
        this.cap = capacity;
        this.head = new Node(0,0);
        this.end = new Node(0,0);
        this.head.next = this.end;
        this.end.prev = this.head;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node) {
        Node prev = this.end.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.end;
        this.end.prev = node;
    }
    
    public int get(int key) {
        if(hs.containsKey(key)) {
           Node node = hs.get(key);
           remove(node);
           insert(node);
           return node.val; 
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hs.containsKey(key)) {
            remove(hs.get(key));
        } 
        Node node = new Node(key,value);
        hs.put(key,node);
        insert(node);

        if(hs.size() > cap) {
            Node l = this.head.next;
            remove(l);
            hs.remove(l.key);
        }
    }
}
