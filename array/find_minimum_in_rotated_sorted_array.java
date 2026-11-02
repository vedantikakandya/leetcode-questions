/*
 * Problem: #153 - Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Category: Binary Search
 * Pattern: Modified Binary Search
 *
 * Approach:
 * 1. Initialize left and right pointers at the array boundaries.
 * 2. Calculate the middle index.
 * 3. Compare nums[mid] with nums[right].
 * 4. If nums[mid] <= nums[right], the minimum lies at mid
 *    or somewhere in the left half. Move right to mid.
 * 5. Otherwise, the minimum lies in the right half.
 *    Move left to mid + 1.
 * 6. When left == right, the minimum element is found.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * Comparing the middle element with the rightmost element
 * helps identify which half contains the minimum.
 *
 * Common Mistake:
 * Using left = mid instead of left = mid + 1 in the
 * second condition, which can cause an infinite loop.
 */

class Solution {
    public int findMin(int[] nums) {
        int right = nums.length - 1;
        int left = 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
