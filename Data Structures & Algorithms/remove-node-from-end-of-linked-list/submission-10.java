/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val;
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode p = head;
        while(p!=null) {
            len++;
            p = p.next;
        }
        if(len == 1 || len == 0) {
            return null;
        }
        p = head;
        ListNode prev = null;
        int c = 1;
        while(c!=(len-n+1)) {
            prev = p;
            p = p.next;
            c++;
        }
        if(prev == null) {
            head = head.next;
        }
        if(prev != null) {
            prev.next = p.next;
        }
        return head;
    }
}
