class TwoSum:

    def __init__(self):
        self.data = []
        

    def add(self, number: int) -> None:
        self.data.append(number)
        

    def find(self, value: int) -> bool:
        sum_map = {}
        for i in range(len(self.data)):
            bal = value - self.data[i]

            if bal in sum_map:
                return True
            else:
                sum_map[self.data[i]] = i
        return False



# Your TwoSum object will be instantiated and called as such:
# obj = TwoSum()
# obj.add(number)
# param_2 = obj.find(value)
