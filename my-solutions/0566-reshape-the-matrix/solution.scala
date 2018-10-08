object Solution {
    def matrixReshape(nums: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
        val result:Array[Array[Int]] = Array.ofDim[Int](r,c)
        var row, col = 0

        if(nums.length == 0 || r * c != nums.length * nums(0).length)
            return nums
        for(re <- 0 until nums.length; ce <- 0 until nums(0).length){
            result(row)(col) = nums(re)(ce)
            col += 1

            if(col == c){
                row += 1
                col = 0
            }
        }
        result
    }
}
