class Solution:
    def sumZero(self, n: int) -> List[int]:
        return [i for i in range(-(n//2), n//2+1) if not (i == 0 and n%2 == 0)]
