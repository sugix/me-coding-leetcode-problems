class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        # Need to keep track of min price and max profit we can get
        min_price = math.inf
        max_profit = 0

        for price in prices:

            min_price = min(min_price, price)
            max_profit = max(max_profit, price - min_price)

        return max_profit

        
