object Solution {
    def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
        val arrayFlipped = A.map(a => a.reverse)
    val arrayInverted = arrayFlipped.map(a => a.map(el => {
      if(el == 0)
        1
      else 0
    }))
    arrayInverted
    }
}
