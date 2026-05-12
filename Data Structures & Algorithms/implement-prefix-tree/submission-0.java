class PrefixTree {
    Node root;
    public PrefixTree() {
         root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for (char c:word.toCharArray()) {
            curr.map.putIfAbsent(c, new Node());
            curr = curr.map.get(c);
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for(char c:word.toCharArray()) {
            if(!curr.map.containsKey(c)) {
                return false;
            }
            curr = curr.map.get(c);
        }
        return curr.end;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (char c:prefix.toCharArray()) {
            if(!curr.map.containsKey(c)) {
                return false;
            }
            curr = curr.map.get(c);
        }
        return true;
    }
}

class Node {
    HashMap<Character,Node> map = new HashMap<>();
    boolean end = false;
}
