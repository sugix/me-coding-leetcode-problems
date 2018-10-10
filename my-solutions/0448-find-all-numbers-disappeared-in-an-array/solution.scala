object Solution {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        for(el <- 0 until nums.length){
      val index:Int = Math.abs(nums(el)) - 1
      nums(index) = - Math.abs(nums(index))
    }

    val result = nums.zipWithIndex.collect{case (el,index) if el > 0 => index + 1}
    result.toList
    }
}
