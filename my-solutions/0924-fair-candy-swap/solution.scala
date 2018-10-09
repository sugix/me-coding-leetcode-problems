import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.HashSet

object Solution {
    def fairCandySwap(A: Array[Int], B: Array[Int]): Array[Int] = {
        val totalACandy:Int = A.reduceLeft(_ + _)
    val totalBCandy:Int = B.reduceLeft(_ + _)

    val deltaInCandyValue = (totalBCandy - totalACandy) / 2

    val bCandyInSet = HashSet[Int](B:_*)
    val result:ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    // For all A candies, we check the if current candy + delta is part of B candy Set
    for(el <- 0 until A.length){
      if(bCandyInSet.contains(A(el) + deltaInCandyValue)){
        result += (A(el),(A(el) + deltaInCandyValue))
        return result.toArray
      }
    }
    
    result.toArray
    }
}
