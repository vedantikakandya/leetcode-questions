/*
=========================================================
Problem #172: Factorial Trailing Zeroes
Difficulty: Medium

Category:
- Math

Pattern:
- Mathematical Observation

Approach:
- A trailing zero is formed by multiplying 2 × 5.
- In a factorial, the number of 2s is always greater than the number
  of 5s.
- Therefore, the number of trailing zeroes depends only on the number
  of factors of 5.
- Repeatedly divide n by 5 and add the quotient to the answer.
- Continue until n becomes less than 5.

Time Complexity: O(log₅n)
Space Complexity: O(1)

Key Learning:
- Count factors instead of calculating the factorial.
- Repeated division by 5 accounts for numbers like 25, 125, etc.,
  which contribute multiple factors of 5.
=========================================================
*/
package math;
class Solution {
    public int trailingZeroes(int n) {
        return zeroes(n);
    }

    public int zeroes(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}