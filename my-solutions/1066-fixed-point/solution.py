class Solution:
    def fixedPoint(self, A: List[int]) -> int:
        result = -1
        for _ in range(len(A)):
            if(A[_] == _):
                result = _
                return result
        return result
        
        
        ''' Smart way to improve performance. If we feel the middle elemend is 
        greater than the index itself then there is no way you will find an element which is equal to its index after the current middle element, so make the right point to element before the middle element or point left point to element next to mid
        left, right = 0, len(A)-1
        while left <= right:
            mid = left + (right-left)//2
            if A[mid] >= mid:
                right = mid-1
            else:
                left = mid+1
        return left if A[left] == left else -1
        '''
