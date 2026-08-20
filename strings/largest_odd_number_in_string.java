/*
=========================================================
Problem #1903: Largest Odd Number in String
Difficulty: Easy

Category:
- Strings

Pattern:
- Greedy
- String Traversal

Approach:
- An integer is odd if its last digit is odd.
- Therefore, scan the string from right to left.
- Find the rightmost odd digit.
- Return the substring from the beginning up to that digit.
- This gives the largest possible odd number because we keep
  the longest possible prefix.

Time Complexity: O(n)
Space Complexity: O(n) for the returned substring.

Key Learning:
- For a number to be odd, only its last digit matters.
- Scanning from the end allows us to find the longest prefix
  that forms an odd number.
- We do not need to convert the string into an integer,
  which also avoids overflow for very large numbers.

Optimization:
- Already Optimal in time complexity.

Common Mistake:
- Converting the entire string to an integer.
- Searching from the beginning instead of the end.
- Returning the first odd digit instead of the rightmost odd digit.

=========================================================
*/

class Solution {

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}