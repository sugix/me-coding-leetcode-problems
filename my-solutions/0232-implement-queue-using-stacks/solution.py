class MyQueue:

    def __init__(self):
        self.stack = []
        self.stack2 = []
        

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> int:
        # using stack2 as temporary stack
        if len(self.stack2) == 0:
            while len(self.stack) > 0:
                self.stack2.append(self.stack.pop())
        return self.stack2.pop()

    def peek(self) -> int:
        if len(self.stack2) == 0:
            while len(self.stack) > 0:
                self.stack2.append(self.stack.pop())
        return self.stack2[-1]

    def empty(self) -> bool:
        return len(self.stack) == 0 and len(self.stack2) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
