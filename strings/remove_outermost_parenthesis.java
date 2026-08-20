/*
=========================================================
Problem #1021: Remove Outermost Parentheses
Difficulty: Easy

Category:
- Strings

Pattern:
- Depth Tracking
- StringBuilder

Approach:
- Maintain a depth variable to track the current nesting
  level of parentheses.
- When '(' is encountered:
    - If depth > 0, it is not an outermost parenthesis,
      so add it to the result.
    - Increase depth.
- When ')' is encountered:
    - Decrease depth first.
    - If depth > 0, it is not an outermost parenthesis,
      so add it to the result.
- The parentheses that change depth between 0 and 1 are
  the outermost parentheses and are skipped.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- The depth of parentheses can be used to identify
  outermost parentheses without using a stack.
- StringBuilder is efficient for constructing the result.

Optimization:
- Already Optimal in time complexity.
- StringBuilder avoids repeated String concatenation.

Common Mistake:
- Appending '(' before checking its depth.
- Checking depth after incrementing for '('.
- Forgetting to decrease depth before checking ')'.

=========================================================
*/

class Solution {

    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                if (depth > 0) {
                    result.append(c);
                }

                depth++;
            }

            else {

                depth--;

                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}