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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode ans = null;
        ListNode p3 = null;
        while(p1!=null && p2!=null) {
            if(p1.val < p2.val) {
                if(ans == null) {
                    ans = p1;
                    p3 = ans;
                } else {
                    p3.next = p1;
                    p3 = p3.next;
                }
                p1 = p1.next;
            } else {
                if(ans == null) {
                    ans = p2;
                    p3 = ans;
                } else {
                    p3.next = p2;
                    p3 = p3.next;
                }
                p2 = p2.next;
            }
        }
        if(p1 != null) {
            if(ans == null) {
                    ans = p1;
            } else {
                p3.next = p1;
            }
        } 
        if(p2 != null) {
            if(ans == null) {
                    ans = p2;
            } else {
                p3.next = p2;
            }
        }
        return ans;
    }
}