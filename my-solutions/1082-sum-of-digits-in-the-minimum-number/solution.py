class Solution:
    def sumOfDigits(self, A: List[int]) -> int:
        total = sum([int(c) for c in str(min(A))])
        return 1 if total % 2 == 0 else 0
