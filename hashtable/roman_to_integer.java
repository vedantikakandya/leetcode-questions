/*
 * Problem: #13 - Roman to Integer
 * Difficulty: Easy
 * Category: HashMap
 * Pattern: Reverse Traversal / Conditional Subtraction
 *
 * Approach:
 * 1. Store each Roman numeral and its integer value in a HashMap.
 * 2. Traverse the string from right to left.
 * 3. If the current numeral's value is smaller than the value
 *    of the numeral immediately to its right, subtract it.
 * 4. Otherwise, add its value to the answer.
 * 5. Return the final integer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) auxiliary space
 *
 * Key Learning:
 * A smaller numeral before a larger numeral represents
 * subtraction, as in IV = 4 and IX = 9.
 *
 * Common Mistake:
 * Adding every numeral directly without accounting for
 * subtractive combinations.
 */

package hashtable;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (i < s.length() - 1 &&
                map.get(c) < map.get(s.charAt(i + 1))) {
                ans -= map.get(c);
            } else {
                ans += map.get(c);
            }
        }

        return ans;
    }
}