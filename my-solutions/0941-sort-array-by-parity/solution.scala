
import scala.collection.mutable.ArrayBuffer
object Solution {
    def sortArrayByParity(A: Array[Int]): Array[Int] = {
        val (evenElements, oddElements) = A.partition(x => (x % 2) == 0)

    val result:ArrayBuffer[Int] = ArrayBuffer(evenElements:_*)
    result ++= oddElements
    result.toArray
    }
}
