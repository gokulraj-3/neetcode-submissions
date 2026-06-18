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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL || (head->next == NULL && n == 1)) return NULL;
        ListNode* p = head;
        int cnt = 0;
        while(p){
            p = p->next;
            cnt++;
        }

        if (cnt == n) return head->next;
        ListNode* curr = head;
        int target = cnt - n;
        for(int i = 1; i < target; i++){
            curr = curr->next;
        }
        curr->next = curr->next->next;   
        return head;
    }
};
