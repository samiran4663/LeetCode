/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Boolean> list= new HashMap<>();
        Integer count=0;
        while(temp!=null)
        {
            if(list.containsKey(temp))
            {
                return temp;
            }
            list.put(temp,true);
            temp=temp.next;
        }
        return null;
    }
}