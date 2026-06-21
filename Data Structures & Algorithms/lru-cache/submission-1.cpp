class Node {
public:
    int key, val;
    Node* next;
    Node* prev;
    
    Node(int _key, int _val) {
        key = _key;
        val = _val;
        next = nullptr;
        prev = nullptr;
    }
};

class LRUCache {
public:
    unordered_map<int, Node*> mpp;
    int capacity;
    Node* head;
    Node* tail;

    LRUCache(int _capacity) {
        capacity = _capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head->next = tail;
        tail->prev = head;

    }
    
    int get(int key) {
        if(mpp.find(key) != mpp.end()){
            Node* node = mpp[key];
            deleteNode(node);
            insertafterhead(node);
            return node->val;
        }
        return -1;
    }
    
    void put(int key, int value) {
        if(mpp.find(key) != mpp.end()) {
            Node* node = mpp[key];
            node->val = value;
            deleteNode(node);
            insertafterhead(node);
        }
        else{
            if(mpp.size() == capacity){
                Node* node = tail->prev;
                mpp.erase(node->key);
                deleteNode(node);
            }
            Node* node = new Node(key, value);
            mpp[key] = node;
            insertafterhead(node);
        }
    }
    
    void insertafterhead(Node* node){
        Node* temp = head->next;

        head->next = node;
        node->prev = head;

        node->next = temp;
        temp->prev = node;

    }
    void deleteNode(Node* node){
        Node* prev_node = node->prev;
        Node* nxt_node = node->next;

        prev_node->next = nxt_node;
        nxt_node->prev = prev_node;
    }
};
