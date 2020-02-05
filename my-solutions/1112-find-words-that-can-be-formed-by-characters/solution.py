class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        def check(word, chars, count):
            if len(word) > len(chars):
                return False
            curr_count = collections.Counter()
            for c in word:
                curr_count[c] += 1
                
                # If the character is not part of list of characters or its frequency
                if c not in count or count[c] < curr_count[c]:
                    return False
            return True
        
        count = collections.Counter(chars)
        return sum(len(word) for word in words if check(word, chars, count))
