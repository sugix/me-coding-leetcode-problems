object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        var counter = 0
        var total = 0
        for(el <- 0 until nums.length){
            if(nums(el) == 1){
                counter += 1
                total = Math.max(total, counter)
            }
            else
                counter = 0
        }
        total
    }
}
