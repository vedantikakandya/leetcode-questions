/*
=========================================================
Problem #1752: Check if Array Is Sorted and Rotated
Difficulty: Easy

Category:
- Arrays

Pattern:
- Observation

Approach:
- Traverse the array and count how many times the order decreases
  (i.e., nums[i] > nums[i + 1]).
- Use modulo (%) so that the last element is also compared with the
  first element.
- If the array is sorted and rotated, there can be at most one such
  decrease (drop).
- If more than one drop exists, the array cannot be sorted and rotated.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Circular traversal using modulo (%).
- A sorted & rotated array has at most one inversion (drop).

=========================================================
*/


package array;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        int drops = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                drops++;
            }
        }

        return drops <= 1;
    }
}
