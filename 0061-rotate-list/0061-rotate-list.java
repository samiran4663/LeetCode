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
        ListNode temp=head;
        if(head==null || head.next==null) return head;
        int length=1;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%length;
        k=length-k;
        ListNode newnode=head;
        for(int i=1;i<k;i++)
        {
            newnode=newnode.next;
        }
        head=newnode.next;
        newnode.next=null;
        return head;

    }
}