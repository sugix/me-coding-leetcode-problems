class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0

        last = 0
        for i in range(len(nums)):
            if nums[last] != nums[i]:
                last += 1
                nums[last] = nums[i]
        return last + 1
