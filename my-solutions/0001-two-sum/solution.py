class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        value_index_map = {}
        indices = []

        for index, num in enumerate(nums):

            ## Find the second value from the target
            second_num = target - num

            if value_index_map.get(second_num, None) is not None:
                second_indx = value_index_map.get(second_num)
                indices.append(index)
                indices.append(second_indx)
            else:
                value_index_map[num]=index

        return indices
