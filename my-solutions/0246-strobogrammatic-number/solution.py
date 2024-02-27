class Solution:
    def isStrobogrammatic(self, num: str) -> bool:
        # dic to store strob number
        strob_dict = {'0' : '0', '1': '1', '8': '8', '6':'9', '9' : '6'}
        res = []
        for n in num:

            if n in strob_dict:
                res.append(strob_dict[n])
            else:
                return False

        return res[::-1] == list(num)


