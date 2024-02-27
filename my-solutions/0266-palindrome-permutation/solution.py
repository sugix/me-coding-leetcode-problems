from collections import defaultdict

class Solution:
    def canPermutePalindrome(self, s: str) -> bool:
        
        # Based on simple logic rather than calculating all permutations and then checking if they are palindrome

        char_freq = defaultdict(int)

        for ch in s:
            char_freq[ch] += 1

        odd_count = 0

        for c in char_freq:
            if char_freq[c] % 2 == 1:
                odd_count += 1

        if odd_count > 1:
            return False
        return True


