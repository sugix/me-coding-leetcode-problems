

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        def digit_count(n):
            result = 0
            while n:
                n //= 10
                result += 1
            return result

        return sum(digit_count(n) % 2 == 0 for n in nums)
