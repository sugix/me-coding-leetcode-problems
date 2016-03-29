/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        Comparator<ListNode> c = (a,b) -> {
          return a.val > b.val ? +1 : a.val < b.val ? -1 : 0;  
        };
        
        Queue<ListNode> processingQueue = new PriorityQueue<>(lists.length,c);
        
        // Add the head of all lists to the processingQueue
        for(ListNode list: lists){
            if(list != null)
                processingQueue.add(list);
        }
        
        // Create a dummy head node
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        while(processingQueue.size() > 0){
            ListNode temp = processingQueue.poll();
            p.next = temp;
            
            if(temp.next != null)
                processingQueue.add(temp.next);
            p = p.next;     
        }
        
        return head.next;
    }
}
