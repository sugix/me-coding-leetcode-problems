class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        stack = []
        to_remove = set()
        for i, c in enumerate(s):
            if c == '(':
                stack.append(i)
            elif c == ')':
                if not stack:
                    to_remove.add(i)
                else:
                    stack.pop()
        to_remove.update(stack)
        return ''.join(c for i, c in enumerate(s) if i not in to_remove)
