/*
=========================================================
Problem #: Maximum Product of Two Digits
Difficulty: Easy

Category:
- Math

Pattern:
- Digit Manipulation
- Maximum Element Tracking

Approach:
- Traverse the digits of the number from right to left.
- Keep track of the largest digit (maxDigit) and the second largest
  digit (secondMaxDigit).
- If the current digit is greater than or equal to the largest digit:
    - Update secondMaxDigit with the previous maxDigit.
    - Update maxDigit.
- Otherwise, update secondMaxDigit if needed.
- Return the product of the two largest digits.

Time Complexity: O(d)
Space Complexity: O(1)

where:
- d = number of digits in the integer

Key Learning:
- Multiple maximum values can be tracked in a single traversal.
- Digit extraction using modulo (%) and division (/) is a common
  mathematical technique.
- One-pass solutions are often better than sorting.

Optimization:
- Already Optimal.

=========================================================
*/
package math;
class Solution {

    public int maxProduct(int n) {

        int maxDigit = 0;
        int secondMaxDigit = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit >= maxDigit) {
                secondMaxDigit = maxDigit;
                maxDigit = digit;
            } else if (digit > secondMaxDigit) {
                secondMaxDigit = digit;
            }

            n /= 10;
        }

        return maxDigit * secondMaxDigit;
    }
}