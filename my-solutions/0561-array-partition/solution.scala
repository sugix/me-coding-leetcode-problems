object Solution {
    def arrayPairSum(nums: Array[Int]): Int = {
        var sum = 0
        val numsGrouped = nums.sorted.grouped(2)
        while(numsGrouped.hasNext){
            val elementsIter = numsGrouped.next()
            sum += Math.min(elementsIter(0), elementsIter(1))
        }
        sum 
    }
}
