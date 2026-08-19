/*
=========================================================
Problem #48: Rotate Image
Difficulty: Medium

Category:
- Arrays
- Matrix

Pattern:
- Matrix Manipulation
- Transpose + Reverse

Approach:
- To rotate the matrix 90 degrees clockwise:
    1. Transpose the matrix.
    2. Reverse every row.
- Transposing swaps elements across the main diagonal.
- Reversing each row after transposing produces the
  required clockwise rotation.

Time Complexity: O(n²)
Space Complexity: O(1)

Key Learning:
- A 90-degree clockwise matrix rotation can be achieved
  using two simple operations:
    - Transpose
    - Reverse each row
- The matrix can be modified in-place without using
  an extra matrix.

Optimization:
- Already Optimal.

Common Mistake:
- Swapping the entire matrix without restricting the
  transpose loop to j = i + 1.
- Reversing columns instead of rows.
- Using an extra matrix unnecessarily.

=========================================================
*/
package matrix;
class Solution {

    public void rotate(int[][] matrix) {

        // Step 1: Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = i + 1; j < matrix[0].length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix[0].length - 1;

            while (left < right) {

                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}