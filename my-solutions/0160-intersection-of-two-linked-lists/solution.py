# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        nodes_in_A = set()

        while headA:
            nodes_in_A.add(headA)
            headA = headA.next

        while headB:
            if headB in nodes_in_A:
                return headB
            headB = headB.next

        return None
        
