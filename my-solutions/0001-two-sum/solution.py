class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup_dict = {}
        result_indices = []

        for i,num in enumerate(nums):
            remaining = target - num

            if remaining in lookup_dict:
                result_indices.append(i)
                result_indices.append(lookup_dict[remaining])
            else:
                lookup_dict[num] = i

        return result_indices
