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
        ListNode ans = null;
        ListNode itr = null;
        while(list1!=null && list2!=null) {
            ListNode newNode = null;
            if(list1.val <= list2.val) {
                newNode = new ListNode(list1.val);
                list1=list1.next;
            } else {
                newNode = new ListNode(list2.val);
                list2=list2.next;
            }
            if(ans==null) {
                ans = newNode;
                itr = ans;
            } else {
                itr.next = newNode;
                itr = itr.next;
            }
        }
        if(list1!=null) {
            if(ans == null) {
                ans = list1;
            } else {
                itr.next = list1;
            }
            
        } 
        else if(list2!=null) {
            if(ans == null) {
                ans = list2;
            } else {
                itr.next = list2;
            }
        }
        return ans;
    }
}