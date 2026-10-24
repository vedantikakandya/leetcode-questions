/*
 * Problem: #1614 - Maximum Nesting Depth of the Parentheses
 * Difficulty: Easy
 * Category: Strings
 * Pattern: Depth Tracking / Counter
 *
 * Approach:
 * 1. Traverse the string character by character.
 * 2. Increment depth when an opening parenthesis '(' appears.
 * 3. Decrement depth when a closing parenthesis ')' appears.
 * 4. Update maxDepth whenever the current depth increases.
 * 5. Return the maximum depth encountered.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * A counter can track the current nesting depth without
 * needing a stack when only the maximum depth is required.
 *
 * Common Mistake:
 * Counting opening and closing parentheses without tracking
 * their current difference, which represents the nesting depth.
 */

class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (s.charAt(i) == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}