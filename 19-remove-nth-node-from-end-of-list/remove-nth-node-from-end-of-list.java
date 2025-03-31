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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode temp = head;
    int length = 0;

    // Calculate length of the list
    while (temp != null) {
        length++;
        temp = temp.next;
    }

    // Find the previous node of the target node
    int wrap = length - n;
    if(length==n)
    {
        head=head.next;
        dummy.next=head;
        return dummy.next;
    }
    temp=head;
    for (int i = 1; i < wrap; i++) {
        temp = temp.next;
    }

    // Remove the nth node from the end
    temp.next = temp.next.next;

    return dummy.next; // Return the updated head
}

}