/*
=========================================================
Problem #53: Maximum Subarray
Difficulty: Medium

Category:
- Arrays
- Dynamic Programming

Pattern:
- Kadane's Algorithm
- Dynamic Programming

Approach:
- Initialize the current sum and maximum sum with the
  first element of the array.
- Traverse the array starting from the second element.
- At each element:
    - Either start a new subarray from the current element.
    - Or extend the previous subarray.
- Update the maximum sum whenever a larger sum is found.
- Return the maximum subarray sum.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Kadane's Algorithm finds the maximum subarray sum in
  a single traversal.
- At every position, decide whether to start a new
  subarray or continue the existing one.
- Dynamic Programming can often be optimized to constant
  space by storing only the previous state.

Optimization:
- Already Optimal.

Common Mistake:
- Initializing currentSum and maxSum to 0.
- This fails when the array contains all negative numbers.

=========================================================
*/
package dynamic_programming;

class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}