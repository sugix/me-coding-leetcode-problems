class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        def missing_count(index):
            return arr[index] - (index + 1)


        left, right = 0, len(arr) - 1
        while left <= right:

            mid = left + (right - left ) // 2
            if missing_count(mid) < k:
                left = mid + 1
            else:
                right = mid - 1

        return left + k
