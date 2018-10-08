object Solution {
    def shortestDistance(words: Array[String], word1: String, word2: String): Int = {
        var wordOnePointer:Int = -1
        var wordTwoPointer:Int = -1
        var minDistance = words.length

        for(el <- 0 until words.length)
        {
            if(words(el).equalsIgnoreCase(word1))
                wordOnePointer = el
            if(words(el).equalsIgnoreCase((word2)))
                wordTwoPointer = el

            if(wordOnePointer != -1 && wordTwoPointer != -1){
                minDistance = Math.min(minDistance, Math.abs(wordOnePointer - wordTwoPointer))
            }
        }
        minDistance 
    }
}
