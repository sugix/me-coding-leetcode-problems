import scala.collection.mutable._

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        
        val valueIndicesMap = new HashMap[Int, Int]()
    val returnValues = new ArrayBuffer[Int]()


    // Iterate the numbers and populate the map
    for ((num, index) <- nums.zipWithIndex) {

      val difference: Int = target - num

      if (valueIndicesMap.isDefinedAt(difference)) {

        returnValues += valueIndicesMap.get(difference).get
        returnValues += index

      }

      valueIndicesMap += (num -> index)
    }

    return returnValues.toArray
        
        
    }
}
