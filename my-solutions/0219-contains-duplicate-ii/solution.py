class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        
        # If there are no duplicated, return False
        if len(nums) == len(set(nums)):
            return False

        else:
            for i in range(len(nums)):
                for j in range(i+1, len(nums)):
                    if nums[i] == nums[j] and abs(i - j) <= k:
                        return True

            return False
