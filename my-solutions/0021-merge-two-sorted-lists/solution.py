# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from heapq import *

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        """min_heap = []

        for lst in [list1, list2]:
            heappush(min_heap, lst)

        head_node, tail_node = None, None

        while min_heap:

            node = heappop(min_heap)

            if head_node is None:
                head_node = tail_node = node
            else:
                tail_node.next = node
                tail_node = tail_node.next
            if node.next is not None:
                heappush(min_heap, node.next)

        return head_node"""

        head = ListNode()
        result_head = head

        while list1 and list2:
            if list1.val < list2.val:
                head.next = list1
                list1 = list1.next
            else:
                head.next = list2
                list2 = list2.next
            head = head.next

        if list1:
            head.next = list1
        if list2:
            head.next = list2

        return result_head.next
