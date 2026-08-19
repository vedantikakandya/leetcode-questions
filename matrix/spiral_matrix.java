/*
=========================================================
Problem #54: Spiral Matrix
Difficulty: Medium

Category:
- Arrays
- Matrix

Pattern:
- Boundary Traversal
- Simulation

Approach:
- Maintain four boundaries:
    - top
    - bottom
    - left
    - right
- Traverse the matrix in four directions:
    1. Left → Right across the top row.
    2. Top → Bottom down the right column.
    3. Right → Left across the bottom row.
    4. Bottom → Top up the left column.
- After completing each direction, shrink the corresponding
  boundary.
- Continue until the boundaries cross.

Time Complexity: O(m × n)
Space Complexity: O(1) excluding the output list.

Key Learning:
- Boundary variables are useful for traversing a matrix
  layer by layer.
- After processing a boundary, move it inward to avoid
  visiting the same elements again.
- Conditions before the bottom and left traversals prevent
  duplicate elements when only one row or column remains.

Optimization:
- Already Optimal.

Common Mistake:
- Forgetting to update the boundaries.
- Traversing the bottom row when top > bottom.
- Traversing the left column when left > right.
- Using incorrect initial right boundary:
    matrix[0].length - 1

=========================================================
*/
package matrix;
import java.util.ArrayList;
import java.util.List;
class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left → Right
            righty(matrix, left, right, top, list);
            top++;

            // Top → Bottom
            downy(matrix, top, bottom, right, list);
            right--;

            // Right → Left
            if (top <= bottom) {
                lefty(matrix, left, right, bottom, list);
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                upy(matrix, top, bottom, left, list);
                left++;
            }
        }

        return list;
    }

    public static void righty(
            int[][] matrix,
            int left,
            int right,
            int top,
            List<Integer> list) {

        for (int j = left; j <= right; j++) {
            list.add(matrix[top][j]);
        }
    }

    public static void downy(
            int[][] matrix,
            int top,
            int bottom,
            int right,
            List<Integer> list) {

        for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
        }
    }

    public static void lefty(
            int[][] matrix,
            int left,
            int right,
            int bottom,
            List<Integer> list) {

        for (int j = right; j >= left; j--) {
            list.add(matrix[bottom][j]);
        }
    }

    public static void upy(
            int[][] matrix,
            int top,
            int bottom,
            int left,
            List<Integer> list) {

        for (int i = bottom; i >= top; i--) {
            list.add(matrix[i][left]);
        }
    }
}