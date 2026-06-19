/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head == NULL) return head;

        //creating copy list
        Node* p1 = head;
        Node* new_node = NULL;
        while(p1){
            new_node = new Node(p1->val);
            Node* nxt = p1->next;
            p1->next = new_node;
            new_node->next = nxt;
            p1 = nxt;
        }

        //assigning random pointer of the copylist
        p1 = head;
        while(p1){
            if(p1->random) p1->next->random = p1->random->next;
            p1 = p1->next->next;
        }

        //decoupling original list and copy list
        p1 = head;
        Node* res = head->next;
        while(p1){
            Node* temp = p1->next;
            p1->next = temp->next;
            if(temp->next) temp->next = temp->next->next;
            p1 = p1->next;
        }
        return res;
    }
};
