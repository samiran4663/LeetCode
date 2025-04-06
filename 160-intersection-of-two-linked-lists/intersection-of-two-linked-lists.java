/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy1=new ListNode();
        ListNode dummy2=new ListNode();
        int l1=0,l2=0;
        dummy1=headA;dummy2=headB;int diff=0;
        while(dummy1!=null)
        {
            l1++;
            dummy1=dummy1.next;
        }
        while(dummy2!=null)
        {
            l2++;
            dummy2=dummy2.next;
        }
        dummy1=headA;
        dummy2=headB;
        if(l1>l2)
        {
            diff=l1-l2;
            
            for(int i=0;i<diff;i++)
            {
                dummy1=dummy1.next;
            }
        }
        else
        {
            diff=l2-l1;
            
            for(int i=0;i<diff;i++)
            {
                dummy2=dummy2.next;
            }
        }
        while(dummy1!=null && dummy2!=null)
        {
            if(dummy1==dummy2) return dummy1;
            dummy1=dummy1.next;dummy2=dummy2.next;
        }
        return null;
    }
}