import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 != null)
            return l2;
        else if(l1 != null && l2 == null)    
            return l1;
        else if(l1 == null && l2 == null)
            return new ListNode(0);
            
        ListNode resultHeadNode = null;
        
        Map<Integer,Integer> listOneElements = new HashMap<>();
        int count = 0;
        while(l1 != null){
          listOneElements.put(count,l1.val);
          count+=1;
          l1 = l1.next;
        }
        
        int carryOver = 0;
        ListNode prevNode = resultHeadNode;
        ListNode currentNode = resultHeadNode;
        
        // Iterate the second list
        count = 0;
        
        while(l2 != null){
            int sum = 0;
            if(listOneElements.containsKey(count))
                sum = l2.val + listOneElements.get(count) + carryOver;
            else
                sum = l2.val + 0 + carryOver;
            carryOver = sum / 10;
            sum = sum % 10;
            if(count == 0){
                resultHeadNode = new ListNode(sum);
                currentNode = resultHeadNode;
                prevNode = resultHeadNode;
            }else{
                currentNode = new ListNode(sum);
                prevNode.next = currentNode;
                prevNode = currentNode;
            }
            count+=1;
            l2 = l2.next;
        }
        
        if(count == 1 && carryOver > 0 && listOneElements.size()==count){
            currentNode = new ListNode(carryOver);
            prevNode.next = currentNode;
            prevNode = currentNode;
            carryOver = 0;
        }
        
        if(listOneElements.size() > count){
            int sum = 0;
            while(count <= listOneElements.size()-1){
                sum = listOneElements.get(count) + carryOver;
                carryOver = sum / 10;
                sum = sum % 10;
                currentNode = new ListNode(sum);
                prevNode.next = currentNode;
                prevNode = currentNode;
                count += 1;
            }
        }
        
        if(carryOver > 0){
            currentNode = new ListNode(carryOver);
            prevNode.next = currentNode;
            prevNode = currentNode;
        }
        currentNode.next = null;
        return resultHeadNode;
    }
}
