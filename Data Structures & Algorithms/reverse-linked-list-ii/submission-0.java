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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode start = null;
        int cnt = 1;
        ListNode itr = head;
        ListNode prev = dummy;
        ListNode nxt = null;
        ListNode tprev = null;
        while(cnt <= right ) {
            if(cnt==left) {
                ListNode subTail = itr;
                while(cnt <= right) {
                    nxt = itr.next;
                    itr.next = tprev;
                    tprev = itr;
                    itr = nxt;
                    cnt++;
                }
                prev.next = tprev;
                subTail.next = itr;
                break;
            }
            prev = itr;
            itr = itr.next;
            cnt++;
        }
        return dummy.next;
    }
}