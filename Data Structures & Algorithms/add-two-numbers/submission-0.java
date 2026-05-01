/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode itr1 = l1;
        ListNode itr2 = l2;
        ListNode head = null;
        ListNode ans = head;
        while(itr1!=null && itr2!=null) {
            int sum = itr1.val+itr2.val+carry;
            carry = sum/10;
            sum = sum%10;
            if(head == null) {
                head = new ListNode(sum);
                ans = head;
            } else {
                ans.next = new ListNode(sum);
                ans = ans.next;
            }
            itr1 = itr1.next;
            itr2 = itr2.next;
        }
        while(itr1!=null) {
            int sum = itr1.val+carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            itr1 = itr1.next;
        }
        while(itr2!=null) {
            int sum = itr2.val+carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            itr2 = itr2.next;
        }
        if(carry!=0){
            ans.next = new ListNode(carry);
        }
        return head;

    }
}
