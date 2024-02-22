class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        non_val_index = 0

        for curr in range(len(nums)):
            if nums[curr] != val:
                nums[non_val_index] = nums[curr]
                non_val_index += 1

        return non_val_index
        
