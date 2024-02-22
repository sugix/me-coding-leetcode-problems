class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a_int = int(a, 2)
        b_int = int(b, 2)
        intSum = a_int + b_int
        binarySum = bin(intSum)

        return binarySum[2:]
        
