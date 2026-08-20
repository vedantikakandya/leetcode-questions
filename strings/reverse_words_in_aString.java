/*
=========================================================
Problem #151: Reverse Words in a String
Difficulty: Medium

Category:
- Strings

Pattern:
- String Manipulation
- Two Pointers

Approach:
- Remove leading and trailing spaces using trim().
- Split the string using one or more whitespace characters
  so multiple spaces are handled correctly.
- Reverse the array of words using two pointers.
- Join the reversed words with a single space.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- "\\s+" can be used to split a string on one or more
  whitespace characters.
- trim() removes unnecessary spaces at the beginning
  and end.
- Two pointers can reverse an array in-place.

Optimization:
- The solution is efficient enough for the problem.
- A character-level in-place solution can reduce extra
  space, but is more complicated and unnecessary here.

Common Mistake:
- Using split(" ") instead of split("\\s+"), which can
  create empty strings when multiple spaces exist.
- Forgetting to remove leading/trailing spaces.
- Returning words in the original order.

=========================================================
*/

class Solution {

    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        reverseString(words);

        return String.join(" ", words);
    }

    public void reverseString(String[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}