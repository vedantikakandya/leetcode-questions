/*
=========================================================
Problem #125: Valid Palindrome
Difficulty: Easy

Category:
- Strings
- Two Pointers

Pattern:
- Two Pointers

Approach:
- Remove all non-alphanumeric characters from the string.
- Convert the string to lowercase.
- Initialize two pointers:
    - left at the beginning
    - right at the end
- Compare characters at both pointers.
- If they are different, return false.
- Otherwise, move both pointers towards the center.
- If all characters match, return true.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- String preprocessing using Regular Expressions.
- Two Pointer technique for palindrome checking.

Optimization:
- This solution creates a new string after cleaning the input.
- A better approach uses two pointers directly on the original string,
  skipping non-alphanumeric characters, reducing extra space to O(1).

=========================================================
*/
package strings;
class Solution {
    public boolean isPalindrome(String s) {

        String cleanText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {

            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}