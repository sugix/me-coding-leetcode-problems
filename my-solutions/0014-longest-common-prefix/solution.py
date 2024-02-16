class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        if len(strs) == 0:
            return ""
        if len(strs) == 1:
            return strs[0]
        strs.sort()

        lcp = []

        for str1_ch, str2_ch in zip(strs[0], strs[-1]):
            if str1_ch == str2_ch:
                lcp.append(str1_ch)
            else:
                break
        
        return "".join(lcp)

