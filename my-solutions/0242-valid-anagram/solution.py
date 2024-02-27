from collections import defaultdict
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        # Implementing something different than sorted(s) == sorted(t)

        if len(s) != len(t):
            return False
        

        freq_map = defaultdict(int)

        for ch in s:
            freq_map[ch] += 1

        for ch in t:
            freq_map[ch] -=1

        for key in freq_map.keys():
            if freq_map[key] != 0:
                return False
        return True
