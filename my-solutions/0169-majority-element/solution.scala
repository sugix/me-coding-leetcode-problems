object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        var counter:Int = 0
    var mElement:Option[Int] = None

    for(el <- 0 until nums.length){
      if(counter == 0) {
        mElement = Option(nums(el))
      }

      if(nums(el) == mElement.get)
        counter += 1
      if(nums(el) != mElement.get)
        counter -= 1
    }

    mElement.get
    }
}
