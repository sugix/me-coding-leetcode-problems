class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:

        for i in range(len(matrix) - 1): ## Rows

            for j in range(len(matrix[0]) - 1): ## Columns

                if matrix[i][j] != matrix[i+1][j+1]:
                    return False

        return True
        
