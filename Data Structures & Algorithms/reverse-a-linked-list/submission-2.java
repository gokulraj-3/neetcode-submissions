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
    public ListNode reverseList(ListNode head) {
        ListNode itr = head;
        ListNode prev = null;
        ListNode nxt = null;
        while(itr != null) {
            nxt = itr.next;
            itr.next = prev;
            prev = itr;
            itr = nxt;
        }
        return prev;
    }
}
