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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next==null){
            return head;
        }
        int len=0;
        ListNode l=head;
        while(l!=null){
            l=l.next;
            len++;
        }
        k=k %len;
        for(int i=0;i<k;i++){
            ListNode curr=head;
            ListNode prev=null;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;

        }
        return head;
    }
}