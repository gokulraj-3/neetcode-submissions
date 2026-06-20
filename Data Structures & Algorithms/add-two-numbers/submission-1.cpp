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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(l1 == NULL && l2 == NULL) return NULL;
        ListNode* l3 = new ListNode(0);
        ListNode* temp = l3;
        int sum = 0, carry = 0;
        while(l1 || l2){
            if(l1){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2){
                sum += l2->val;
                l2 = l2->next;
            }
            int num = sum % 10;
            carry = sum / 10;
            temp->next = new ListNode(num);
            temp = temp->next;
            sum = carry;
        }
        if(carry) temp->next = new ListNode(carry);
        return l3->next;
    
    }
};
