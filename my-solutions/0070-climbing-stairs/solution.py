class Solution:
    def top_down_climbstairs(self, n:int, memo:List[int]) -> int:
        if n == 1:
            return n
        if n == 2:
            return n
        if memo[n] > 0:
            return memo[n]
        memo[n] = self.top_down_climbstairs(n - 1, memo) + self.top_down_climbstairs(n - 2, memo)
        return memo[n]

    def climbStairs(self, n: int) -> int:
        memo = [0] * (n+1)
        return self.top_down_climbstairs(n, memo)

    
