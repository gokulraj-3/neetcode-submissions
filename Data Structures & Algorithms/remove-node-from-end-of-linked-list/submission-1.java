class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int l = 0;
        ListNode itr = head;
        while(itr!=null) {
            l++;
            itr = itr.next;
        }
        l = l-n;
        if (l == 0) {
            return head.next;
        }
        int l2 = 0;
        itr = head;
        while(l2!=l-1) {
            l2++;
            itr = itr.next;
        }
        itr.next = itr.next.next;
        return head;
    }
}