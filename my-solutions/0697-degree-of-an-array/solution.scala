object Solution {
    
    
    def findShortestSubArray(nums: Array[Int]): Int = {
        var leftPositionMap: scala.collection.immutable.HashMap[Int, Int] = scala.collection.immutable.HashMap.empty[Int, Int]
    var rightPositionMap: scala.collection.immutable.HashMap[Int, Int] = scala.collection.immutable.HashMap.empty[Int, Int]
    val elementCountMap: scala.collection.mutable.HashMap[Int, Int] = scala.collection.mutable.HashMap.empty[Int, Int]
    var answer:Int = nums.length

    for (el <- 0 until nums.length) {
      val updatedValue:Int = elementCountMap.get(nums(el)) match {
        case value:Some[Int] => value.get + 1
        case None => 1
      }
       
      elementCountMap += (nums(el) -> updatedValue)
      if(!leftPositionMap.isDefinedAt(nums(el)))
        leftPositionMap = leftPositionMap + (nums(el) -> el)
      rightPositionMap = rightPositionMap + (nums(el) -> el)
    }

    /**
      * We keep track of first occurence of every number and last occurence of every number
      * We also keep track of each and every element's frequency
      *
      * We need to find the degree and when we iterate the count map,
      * if the key is equal to degree for that element, then we find the
      */

    val degree:Int = scala.collection.mutable.ListMap[Int, Int](elementCountMap.toSeq.sortWith(_._2 < _._2):_*).take(1).values.take(1).head
    for((k,v) <- elementCountMap){
      if(v == degree){
        answer = Math.min(answer, (rightPositionMap(k) - leftPositionMap(k)) + 1)
      }
    }
    answer
    }
}
