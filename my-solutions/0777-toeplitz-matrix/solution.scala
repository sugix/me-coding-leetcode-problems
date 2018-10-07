object Solution {
    def isToeplitzMatrix(matrix: Array[Array[Int]]): Boolean = {
        for(r <- 0 until matrix.length; c <- 0 until matrix(0).length){
            if(r > 0 && c > 0 && matrix(r)(c) != matrix(r-1)(c-1))
                return false
        }
        return true
    }
}
