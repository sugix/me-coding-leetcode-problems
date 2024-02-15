class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        index_map = {}
        indices = []

        for index, value in enumerate(nums):

            second_number = target - nums[index]

            if index_map.get(second_number,None) is not None:
                indices.append(index)
                indices.append(index_map[second_number])
            else:
                index_map[value] = index
        
        return indices
