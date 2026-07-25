/*
=========================================================
Problem #69: Sqrt(x)
Difficulty: Easy

Category:
- Binary Search
- Math

Pattern:
- Binary Search on Answer

Approach:
- Handle the edge case where x is less than 2.
- Search for the square root in the range [1, x/2].
- Find the middle element and calculate its square.
- If mid² equals x, return mid.
- If mid² is less than x, search in the right half.
- Otherwise, search in the left half.
- If an exact square root is not found, return the floor value (right).

Time Complexity: O(log n)
Space Complexity: O(1)

Key Learning:
- Binary Search can be applied to search spaces, not just sorted arrays.
- Use 'long' while calculating mid * mid to prevent integer overflow.
- Returning 'right' gives the floor value of the square root.

Optimization:
- Already Optimal.

=========================================================
*/

package math;
class Solution {

    public int mySqrt(int x) {

        if (x < 2)
            return x;

        int left = 1;
        int right = x / 2;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
