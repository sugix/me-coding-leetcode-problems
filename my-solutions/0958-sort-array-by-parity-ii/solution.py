class Solution:
    def sortArrayByParityII(self, A: List[int]) -> List[int]:
        
        ''' One step action to step at every odd index and other one to step 
        at every even index
        
        For every element at even index, if the element contained is not even then
        iterate the rest of the array to figure out where the next even number is present
        and one more smart idea is to find if an even number is located at odd index and we swap
        
        '''
        
        j = 1
        for i in range(0, len(A), 2):
            if A[i] % 2:
                while A[j] % 2:
                    j += 2
                A[i], A[j] = A[j], A[i]
        return A
