class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []

        res = []
        start = nums[0]


        for i in range(1, len(nums)):

            if nums[i-1] + 1 != nums[i]:
                if start == nums[i-1]:
                    res.append(str(start))
                else:
                    res.append(str(start) + "->" + str(nums[i-1]))
                start = nums[i]

        if start == nums[-1]:
            res.append(str(start))
        else:
            res.append(str(start) + "->" + str(nums[-1]))

        return res

