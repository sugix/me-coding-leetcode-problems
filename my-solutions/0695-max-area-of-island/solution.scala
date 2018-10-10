object Solution {
    def maxAreaOfIsland(grid: Array[Array[Int]]): Int = {
        val hasVisited:Array[Array[Boolean]] = Array.ofDim[Boolean](grid.length, grid(0).length)
        var result = 0
    
        def area(rowIndex: => Int, colIndex: => Int):Int = {
            if(rowIndex < 0 || rowIndex >= grid.length 
            || colIndex < 0 || colIndex >= grid(0).length
            || hasVisited(rowIndex)(colIndex)
            || grid(rowIndex)(colIndex) == 0)
                return 0
      
            hasVisited(rowIndex)(colIndex) = true
            (1 + area(rowIndex + 1, colIndex)
            + area(rowIndex - 1, colIndex)
            + area(rowIndex, colIndex + 1)
            + area(rowIndex, colIndex - 1))
        }
    
        for(r <- 0 until grid.length; c <- 0 until grid(0).length){
            result = Math.max(result, area(r,c))
        }
        result
    }
}
