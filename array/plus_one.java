/*
=========================================================
Problem #66: Plus One
Difficulty: Easy

Category:
- Arrays
- Math

Pattern:
- Carry Propagation
- Simulation

Approach:
- Traverse the array from right to left.
- If the current digit is less than 9:
    - Increment it by 1.
    - Return the updated array immediately.
- If the current digit is 9:
    - Set it to 0 and continue moving left (carry forward).
- If all digits are 9:
    - Create a new array of size n + 1.
    - Set the first element to 1.
    - Return the new array.

Time Complexity: O(n)
Space Complexity: O(1)
Extra Space: O(n) only when all digits are 9.

Key Learning:
- Process digits from right to left while handling carry.
- Early return avoids unnecessary iterations.
- Sometimes creating a new array is necessary (e.g., 999 + 1 = 1000).

Optimization:
- Already Optimal.

=========================================================
*/
package array;
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}