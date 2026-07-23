/*
=========================================================
Problem #268: Missing Number
Difficulty: Easy

Category:
- Arrays
- Sorting

Pattern:
- Sorting

Approach:
- Sort the array in ascending order.
- Initialize a variable p = 0.
- Traverse the sorted array.
- If the current element equals p, increment p.
- If a mismatch is found, p is the missing number.
- If no mismatch occurs, return p.

Time Complexity: O(n log n)
Space Complexity: O(1)  // Ignoring the space used by Java's sorting implementation

Key Learning:
- Sorting helps detect missing elements by comparing indices with values.
- Although simple, this is not the most efficient solution.
- Better approaches exist using XOR or the sum formula in O(n) time.
=========================================================
*/
package array;
import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == p) {
                p++;
            } else {
                break;
            }
        }

        return p;
    }
}