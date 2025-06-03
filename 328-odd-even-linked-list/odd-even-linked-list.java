class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;             // starting at 1st node
        ListNode even = head.next;       // starting at 2nd node
        ListNode evenHead = even;        // to attach later at end of odd list

        while (even != null && even.next != null) {
            odd.next = even.next;        // link odd to next odd
            odd = odd.next;              // move odd pointer

            even.next = odd.next;        // link even to next even
            even = even.next;            // move even pointer
        }

        odd.next = evenHead;             // attach even list to end of odd list
        return head;
    }
}
