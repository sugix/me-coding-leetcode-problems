object Solution {
    def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
        val result = Array.ofDim[Int](A(0).length,A.length)
        for(r <- 0 until A.length;c <- 0 until A(0).length){
            result(c)(r) = A(r)(c)
        }
        result
        }
}
