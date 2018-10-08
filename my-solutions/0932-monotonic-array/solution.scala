object Solution {
    def isMonotonic(A: Array[Int]): Boolean = {
        var isIncreasing:Boolean = true
    var isDecreasing:Boolean = true

    for(el <- 0 until A.length - 1){
      if(A(el) > A(el+1))
        isIncreasing = false
      if(A(el) < A(el+1))
        isDecreasing = false
    }

    isDecreasing || isIncreasing
    }
}
