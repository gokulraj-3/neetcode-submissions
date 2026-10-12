/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val;	}
 *     ListNode(int val, ListNode next) { this.val = val;	this.next = next; }
 * }
 */

class Solution {
    public ListNode rev(ListNode mid) {
        ListNode prev = null;
        ListNode nxt = null;
        ListNode curr = mid;
        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        ListNode rev = rev(slow);
        ListNode c = head;
        ListNode n = null;
        ListNode rn = null;
        while(c!=null && rev!=null) {
            n = c.next;
            rn = rev.next;
            c.next = rev;
            if (n == null) {
                break;
            }
            rev.next = n;
            c = n;
            rev = rn;
        }
    }

}
