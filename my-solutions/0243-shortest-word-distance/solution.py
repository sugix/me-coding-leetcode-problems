class Solution:
    def shortestDistance(self, wordsDict: List[str], word1: str, word2: str) -> int:
        word_1_index = -1
        word_2_index = -1

        min_distance = math.inf

        for i in range(len(wordsDict)):

            if wordsDict[i] == word1:
                word_1_index = i

            if wordsDict[i] == word2:
                word_2_index = i

            if word_1_index != -1 and word_2_index != -1:
                min_distance = min(min_distance, abs(word_1_index - word_2_index))
            
        return min_distance
        
        
