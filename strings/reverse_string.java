/*
=========================================================
Problem #344: Reverse String
Difficulty: Easy

Category:
- Strings
- Two Pointers

Pattern:
- Two Pointers
- In-Place Array Manipulation

Approach:
- Initialize two pointers:
    - left at the beginning of the array.
    - right at the end of the array.
- Swap the characters at both pointers.
- Move left forward and right backward.
- Continue until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Reverse an array in-place using two pointers.
- Swapping elements avoids using extra memory.

Optimization:
- Already Optimal.

=========================================================
*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}