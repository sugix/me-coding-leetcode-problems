import itertools

class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        return sum(i != j for i, j in itertools.zip_longest(heights, sorted(heights)))
