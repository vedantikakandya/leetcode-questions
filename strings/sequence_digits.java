/*
=========================================================
Problem #1291: Sequential Digits
Difficulty: Medium

Category:
- Arrays
- Strings

Pattern:
- Brute Force
- String Manipulation

Approach:
- Store "123456789" in a string.
- The length of the required sequential number can only be between
  the number of digits in low and high.
- Generate every possible substring of the required length.
- Convert each substring to an integer.
- If it lies within the given range [low, high], add it to the answer.
- If the generated number exceeds high, stop checking longer
  substrings of that length.

Time Complexity: O(1)
Space Complexity: O(1)

Why O(1)?
- The string "123456789" has a fixed length of 9.
- At most 36 substrings are generated, so the work is constant.

Key Learning:
- Using substrings to generate numbers.
- Restricting search using digit length.
- Early termination when generated number exceeds high.
=========================================================
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> answer = new ArrayList<>();

        String slow = String.valueOf(low);
        String shigh = String.valueOf(high);

        for (int len = slow.length(); len <= shigh.length(); len++) {

            for (int i = 0; i <= str.length() - len; i++) {

                String ggtr = str.substring(i, i + len);
                int gtr = Integer.parseInt(ggtr);

                if (gtr >= low && gtr <= high) {
                    answer.add(gtr);
                }

                if (gtr > high) {
                    break;
                }
            }
        }

        return answer;
    }
}