class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        non_zero_ptr = 0

        for i in range(len(nums)):

            if nums[i] != 0:
                nums[non_zero_ptr], nums[i] = nums[i], nums[non_zero_ptr]
                non_zero_ptr += 1

        return nums
