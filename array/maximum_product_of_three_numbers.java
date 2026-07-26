/*
=========================================================
Problem #628: Maximum Product of Three Numbers
Difficulty: Easy

Category:
- Arrays

Pattern:
- Sorting

Approach:
- Sort the array in ascending order.
- Calculate the product of the three largest numbers.
- Calculate the product of the two smallest numbers and the
  largest number.
- Return the maximum of the two products.
- This handles cases where two negative numbers produce a
  larger positive product.

Time Complexity: O(n log n)
Space Complexity: O(1)

Key Learning:
- Sorting helps compare different candidate solutions easily.
- Do not always assume the three largest numbers give the
  maximum product.
- Two negative numbers can produce a larger positive value.

Optimization:
- Can be optimized to O(n) by tracking the three largest
  and two smallest elements in one traversal.

Common Mistake:
- Considering only the three largest numbers and ignoring
  negative values.

=========================================================
*/
package array;
import java.util.Arrays;
class Solution {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}