class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        """
        # Solution - 2
        num = ''.join(map(str, digits))
        num = str(int(num) + 1)
        return list(map(int, num))
        """ 

        for i in range(len(digits)-1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            else:
                digits[i] = 0

        return [1] + digits

