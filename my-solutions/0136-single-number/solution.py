class Solution:
    def singleNumber(self, nums: List[int]) -> int:

        single_number = 0

        for i in nums:
            single_number ^= i
        return single_number
        
