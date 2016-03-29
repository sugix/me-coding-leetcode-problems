/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return head;
            
        if(head.next == null)    
            return head;
            
            
        ListNode p = head;            
        while(p != null){
            if(p.next != null){
                int currentValue = p.val;
                p.val = p.next.val;
                p.next.val = currentValue;
            }
            if(p.next != null)
                p = p.next.next;
            else
                p = p.next;
        }            
            
        return head;
    }
}
