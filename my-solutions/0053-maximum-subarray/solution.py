class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        result, curr = float("-inf"), float("-inf")
        for x in nums:
            curr = max(curr+x, x)
            result = max(result, curr)
        return result
