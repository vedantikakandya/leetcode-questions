/*
=========================================================
Problem #283: Move Zeroes
Difficulty: Easy

Category:
- Arrays
- Two Pointers

Pattern:
- Two Pointers
- In-Place Array Manipulation

Approach:
- Maintain a pointer (nonZeroIndex) to store the position where the
  next non-zero element should be placed.
- Traverse the array from left to right.
- Whenever a non-zero element is found:
    - Swap it with the element at nonZeroIndex.
    - Increment nonZeroIndex.
- By the end of the traversal, all non-zero elements are moved to the
  front while maintaining their relative order, and all zeros shift
  to the end.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Two pointers help perform in-place array modifications efficiently.
- Swapping only when a non-zero element is found preserves the order
  of non-zero elements.
- No extra array is required.

Optimization:
- Already Optimal.

Common Mistake:
- Using an extra array, which increases space complexity to O(n).

=========================================================
*/
package array;
class Solution {

    public void moveZeroes(int[] nums) {

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
    }
}