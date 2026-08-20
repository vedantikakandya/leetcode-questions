/*
=========================================================
Problem #796: Rotate String
Difficulty: Easy

Category:
- Strings

Pattern:
- String Manipulation
- Rotation

Approach:
- A string can be rotated into another string only if both
  strings have the same length.
- If `goal` is a rotation of `s`, it must appear as a
  substring of `s + s`.
- Therefore:
    1. Check whether both strings have the same length.
    2. Concatenate `s` with itself.
    3. Check whether `goal` exists inside the result.

Example:
s = "abcde"

s + s = "abcdeabcde"

Possible rotations:
"abcde"
"bcdea"
"cdeab"
"deabc"
"eabcd"

All of them appear inside "abcdeabcde".

Time Complexity: O(n)*
Space Complexity: O(n)

Key Learning:
- Doubling a string is a useful technique for rotation problems.
- Every possible rotation of a string appears as a substring
  of the string concatenated with itself.

Optimization:
- This is the standard optimal/simple solution for this problem.

Common Mistake:
- Forgetting to check that both strings have the same length.
- Trying to manually generate every rotation.

=========================================================
*/

class Solution {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }
}