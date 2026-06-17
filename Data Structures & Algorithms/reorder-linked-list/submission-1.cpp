/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    void reorderList(ListNode* head) {
        if(head != NULL && head->next != NULL){
            //find the last node of the list
            ListNode* p2 = head;
            int n=0;
            while(p2 && p2->next){
                p2 = p2-> next;
                n++;
            }
            ListNode* p1 = head;
            ListNode* nxt=NULL;
            
            while(1){
                nxt = p1->next;
                p1->next = p2;
                p2->next = nxt;
                p1 = nxt;
                int cnt = n;
                p2=head;
                while(cnt--) p2=p2->next;
                // n--;
                cout<<p2->val<<" ";
                if(p2 == nxt){
                    p2->next=NULL;
                    break;
                }
                if(p1->next==p2){
                    p2->next=NULL;
                    break;
                }
            }
        }    
    }
};
