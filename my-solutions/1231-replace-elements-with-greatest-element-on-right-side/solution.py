class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        curr_max = -1
        for i in reversed(range(len(arr))):
            arr[i], curr_max = curr_max, max(curr_max, arr[i])
        return arr
