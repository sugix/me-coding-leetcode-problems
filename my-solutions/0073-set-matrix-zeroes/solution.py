import functools

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        first_col = functools.reduce(lambda acc, i: acc or matrix[i][0] == 0, range(len(matrix)), False)
        first_row = functools.reduce(lambda acc, j: acc or matrix[0][j] == 0, range(len(matrix[0])), False)

        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if matrix[i][j] == 0:
                    matrix[i][0], matrix[0][j] = 0, 0

        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0

        if first_col:
            for i in range(len(matrix)):
                matrix[i][0] = 0

        if first_row:
            for j in range(len(matrix[0])):
                matrix[0][j] = 0
