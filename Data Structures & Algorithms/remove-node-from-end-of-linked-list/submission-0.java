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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode prev=dummy, curr=dummy, next=head;

        int k=1;
        while(k<n && next!=null)
        {
            next=next.next;
            k++;
        }
        while(next!=null)
        {
            prev=curr;
            curr=curr.next;
            next=next.next;
        }
        prev.next=curr.next;
        return dummy.next;
    }
}
