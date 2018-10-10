object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        var nonZeroPointer:Int = 0

        for(el <- 0 until nums.length){
            if(nums(el) != 0) {
                nums(nonZeroPointer) = nums(el)
                nonZeroPointer += 1
            }
        }
        
        for(el <- nonZeroPointer until nums.length){
            nums.update(el, 0)
        }
    }
}
