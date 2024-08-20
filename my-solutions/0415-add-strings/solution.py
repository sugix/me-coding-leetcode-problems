class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        # get the length of the two numbers
        len1 = len(num1)
        len2 = len(num2)

        # get the max length
        max_len = max(len1, len2)

        # make the two numbers the same length
        num1 = num1.zfill(max_len)
        num2 = num2.zfill(max_len)

        # initialize the carry
        carry = 0

        # initialize the result
        result = ""

        # iterate through the two numbers
        for i in range(max_len-1, -1, -1):
            # get the sum of the two numbers
            sum = int(num1[i]) + int(num2[i]) + carry

            # get the carry
            carry = sum // 10

            # get the remainder
            sum = sum % 10

            # append the sum to the result
            result = str(sum) + result

        # if there is a carry left, append it to the result
        if carry:
            result = str(carry) + result

        return result
