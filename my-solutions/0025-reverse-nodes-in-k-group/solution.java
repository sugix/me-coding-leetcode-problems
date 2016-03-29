/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode p = head;
    int count = k;
    while (p != null && count != 0) {
        p = p.next;
        count--;
    }
    if (count == 0) {
        p = reverseKGroup(p, k);
        head = reverse(head, p, k);
    }
    return head; 
    }
    
    public ListNode reverse(ListNode head, ListNode res, int k) {
    while (head != null && k-- != 0) {
        ListNode next = head.next;
        head.next = res;
        res = head;
        head = next;
    }
    return res;
    }
}
