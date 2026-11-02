/*
 * Problem: #540 - Single Element in a Sorted Array
 * Difficulty: Medium
 * Category: Binary Search
 * Pattern: Index Parity / Modified Binary Search
 *
 * Approach:
 * 1. Initialize left and right pointers.
 * 2. Calculate the middle index.
 * 3. If mid is even:
 *    - If nums[mid] == nums[mid + 1], the pair is correctly
 *      positioned. Search the right half.
 *    - Otherwise, search the left half, including mid.
 * 4. If mid is odd:
 *    - If nums[mid] == nums[mid - 1], the pair is correctly
 *      positioned. Search the right half.
 *    - Otherwise, search the left half, including mid.
 * 5. When left == right, the remaining element is the answer.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * Before the single element, pairs occupy even-odd indices.
 * After the single element, this pairing pattern shifts.
 *
 * Common Mistake:
 * Using the wrong pointer movement and accidentally skipping
 * the single element or causing an infinite loop.
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        return nums[right];
    }
}
