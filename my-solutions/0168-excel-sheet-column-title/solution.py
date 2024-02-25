class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        result = ""

        while columnNumber > 0:
            columnNumber -= 1

            # Getting the last digit as regular int with modulo operator and then reminder using quotient with regular division
            result = chr(columnNumber % 26 + 65) + result
            columnNumber //= 26
        return result
        
