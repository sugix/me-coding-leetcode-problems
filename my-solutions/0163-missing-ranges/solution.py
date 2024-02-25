class Solution:
    def findMissingRanges(self, nums: List[int], lower: int, upper: int) -> List[List[int]]:

        if not nums:
            return [[lower, upper]]

        # lower --- nums[0] ---- nums[-1] --- upper

        missing_ranges = []

        if lower < nums[0]:
            missing_ranges.append([lower, nums[0] - 1])

        for i in range(1, len(nums)):
            if nums[i] - nums[i - 1] > 1:
                missing_ranges.append([(nums[i - 1] + 1),nums[i] - 1])

        if nums[-1] < upper:
            missing_ranges.append([(nums[-1]+1), upper])

        return missing_ranges



        
