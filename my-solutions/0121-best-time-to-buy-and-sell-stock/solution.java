public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2)
            return 0;
            
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
    for(int i=0; i<prices.length; i++){
       profit = Math.max(profit, prices[i]-minElement);
       minElement = Math.min(minElement, prices[i]);
    }
        return profit;
    }
}
