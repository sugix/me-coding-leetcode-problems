object Solution {
    def isOneBitCharacter(bits: Array[Int]): Boolean = {
        var index:Int = 0
        while(index < bits.length - 1){
            index = index + (bits(index) + 1)
        }
        index == bits.length - 1
    }
}
