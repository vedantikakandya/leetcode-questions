/*
=========================================================
Problem #189: Rotate Array
Difficulty: Medium

Category:
- Arrays
- Two Pointers

Pattern:
- Array Reversal
- In-Place Array Manipulation

Approach:
- Calculate the effective rotations using k % n.
- Reverse the entire array.
- Reverse the first k elements.
- Reverse the remaining n - k elements.
- The array is now rotated to the right by k positions.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Multiple array reversals can achieve rotation efficiently.
- Always reduce k using modulo to handle cases where k > n.
- In-place algorithms avoid using extra memory.

Optimization:
- Already Optimal.

=========================================================
*/
package array;
class Solution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}