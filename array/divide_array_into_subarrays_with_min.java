/*
=========================================================
Problem #3010: Divide an Array Into Subarrays With Minimum Cost I
Difficulty: Easy

Category:
- Arrays
- Greedy

Pattern:
- Greedy
- Minimum Element Tracking

Approach:
- The first element is always included in the total cost.
- Traverse the remaining elements of the array.
- Keep track of the smallest and second smallest values.
- Add these two values to the first element.
- Return the minimum possible cost.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Sometimes only a few minimum/maximum elements are required instead
  of sorting the entire array.
- Tracking two minimum values in one traversal is more efficient than
  sorting.

Optimization:
- Already Optimal.
- Sorting would take O(n log n), whereas this approach works in O(n).

=========================================================
*/
package array;

class Solution {

    public int minimumCost(int[] nums) {

        int answer = nums[0];
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                secondMin = min;
                min = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return answer + min + secondMin;
    }
}