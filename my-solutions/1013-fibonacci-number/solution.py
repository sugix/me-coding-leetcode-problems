class Solution:
    def fib(self, N: int) -> int:
        prev, current = 0, 1
        for i in range(N):
            prev, current = current, prev + current,
        return prev
