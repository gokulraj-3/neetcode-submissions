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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        Deque<ListNode> dq = new LinkedList<>();
        ListNode itr = head;
        while(itr!=null) {
            dq.addLast(itr);
            itr = itr.next;
        }
        ListNode f1 = dq.removeFirst();
        while(!dq.isEmpty()) {
            ListNode l = dq.removeLast();
            f1.next = l;
            f1 = l;
            if (!dq.isEmpty()) {
                ListNode f2 = dq.removeFirst();
                f1.next = f2;
                f1 = f2;
            }
        }
        f1.next = null;
    }
}
