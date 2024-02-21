class Solution:
    def isValid(self, s: str) -> bool:

        # Define list as stack since it allows to get last element as first with pop method
        # Define a mapping between opening and closing brackets. 

        stack = []
        mappings = {")": "(", "}": "{", "]": "["}

        for char in s:

            # if not in mappings then append to stack
            if char not in mappings:
                stack.append(char)
            else:
                top_element = stack.pop() if stack else "#"
                if mappings[char] != top_element:
                    return False

        return not stack
        
