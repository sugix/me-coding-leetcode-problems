class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if not nums:
            return 0

        non_dup_index = 0

        for curr_index in range(1, len(nums)):

            if nums[curr_index] != nums[non_dup_index]:
                non_dup_index += 1
                nums[non_dup_index] = nums[curr_index]

        return non_dup_index + 1
