class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode prev = null;
        ListNode current = head;

        // Move to the `left`-th node
        for (int i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }

        ListNode connection = prev;  // node before sublist
        ListNode tail = current;     // will become tail after reverse

        // Reverse sublist
        ListNode next = null;
        for (int i = 0; i < (right - left + 1); i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Reconnect reversed sublist
        if (connection != null) {
            connection.next = prev; // connect start of reverse to previous part
        } else {
            head = prev; // if left == 1, head should be new head
        }

        tail.next = current; // connect end of reversed part to remaining list

        return head;
    }
}
