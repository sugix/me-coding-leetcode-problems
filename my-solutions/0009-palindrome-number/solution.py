class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        if x < 0:
            return False

        arr = list(str(x))

        start, end = 0, len(arr) - 1

        while start < end:
            if arr[start] != arr[end]:
                return False
            start += 1
            end -= 1

        return True
