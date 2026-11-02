/*
 * Problem: #1283 - Find the Smallest Divisor Given a Threshold
 * Difficulty: Medium
 * Category: Binary Search
 * Pattern: Binary Search on Answer
 *
 * Approach:
 * 1. Set the search range from 1 to the maximum element in nums.
 * 2. Calculate mid as the candidate divisor.
 * 3. Use findceil() to calculate the sum of all ceiling divisions.
 * 4. If the sum is within the threshold, the divisor is valid.
 *    Search for a smaller divisor by moving right = mid.
 * 5. Otherwise, increase the divisor by moving left = mid + 1.
 * 6. When left == right, return the smallest valid divisor.
 *
 * Time Complexity: O(n * log(max(nums)))
 * Space Complexity: O(1)
 *
 * Key Learning:
 * Binary Search on Answer works when a condition is monotonic.
 * If a divisor satisfies the threshold, every larger divisor
 * will also satisfy it.
 *
 * Common Mistake:
 * Using integer division without rounding up, or using an int
 * for the accumulated sum, which can overflow.
 */

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long sum = findceil(nums, mid);

            if (sum <= threshold) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public long findceil(int[] nums, int n) {
        long ans = 0;

        for (int i : nums) {
            int c = (i + n - 1) / n;
            ans += c;
        }

        return ans;
    }
}
