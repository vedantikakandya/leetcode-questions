/*
=========================================================
Problem #: Mirror Distance
Difficulty: Easy

Category:
- Math

Pattern:
- Number Manipulation
- Digit Reversal

Approach:
- Reverse the given integer by extracting its digits one by one.
- Compare the original number with its reversed value.
- Return the absolute difference between the two values.

Time Complexity: O(d)
Space Complexity: O(1)

where:
- d = number of digits in the integer

Key Learning:
- Reverse a number using modulo (%) and division (/).
- Math.abs() is useful for finding the absolute difference.
- Digit extraction is a common technique in mathematical problems.

Optimization:
- Already Optimal.

=========================================================
*/
package math;

class Solution {

    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    private int reverse(int n) {

        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }

        return reversed;
    }
}