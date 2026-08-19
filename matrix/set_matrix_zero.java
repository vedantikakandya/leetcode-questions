/* 
========================================================= 
Problem: Set Matrix Zeroes 
 
Difficulty: Medium 
 
Category: 
- Arrays 
- Matrix 
 
Pattern: 
- Matrix Traversal 
- Extra Space 
 
Approach: 
- Create two boolean arrays to keep track of rows and 
  columns that contain a zero. 
- Traverse the matrix and mark the corresponding row 
  and column whenever a zero is found. 
- Traverse the matrix again. 
- Set an element to zero if its row or column was marked. 
- Return the modified matrix. 
 
Time Complexity: O(m * n) 
Space Complexity: O(m + n) 
 
Key Learning: 
- Use separate arrays to remember which rows and columns 
  need to be converted to zero. 
- The first traversal identifies all affected rows and 
  columns. 
- The second traversal modifies the matrix. 
 
Optimization: 
- The solution can be optimized to O(1) extra space by 
  using the first row and first column of the matrix as 
  markers. 
 
Common Mistake: 
- Modifying the matrix immediately while finding zeros. 
- This can cause newly created zeros to affect other rows 
  and columns incorrectly. 
- Always identify all affected rows and columns first. 
 
========================================================= 
*/

package matrix;

class Solution {

    public void setZeroes(int[][] matrix) {

        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        // Find all rows and columns containing zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Set corresponding rows and columns to zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}