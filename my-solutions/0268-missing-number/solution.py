class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        should_be_sum = n * (n + 1) // 2
        actual_sum = sum(nums)

        return should_be_sum - actual_sum
