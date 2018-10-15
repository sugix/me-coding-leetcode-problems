object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        var profitTotal:Int = 0
    for(el <- 1 until prices.length){
      if(prices(el) > prices(el - 1))
        profitTotal += prices(el) - prices(el - 1)
    }
    profitTotal
    }
}
