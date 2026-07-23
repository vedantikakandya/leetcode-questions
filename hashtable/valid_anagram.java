/*
=========================================================
Problem #242: Valid Anagram
Difficulty: Easy

Category:
- Strings
- HashMap

Pattern:
- Frequency Counting

Approach:
- If the lengths of both strings are different, they cannot be anagrams.
- Create a HashMap to store the frequency of each character in the first string.
- Traverse the second string and decrease the frequency of each character.
- If a character is not present in the HashMap, return false.
- Finally, check whether all frequencies are zero.
- If yes, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Frequency maps are useful for comparing strings.
- getOrDefault() simplifies frequency updates.
- Always perform a length check before processing.

Optimization:
- If the input contains only lowercase English letters, an int[26]
  array can replace the HashMap, reducing space and improving speed.

=========================================================
*/
package hashtable;
import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> inventory = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            inventory.put(s.charAt(i),
                    inventory.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {

            if (!inventory.containsKey(t.charAt(i))) {
                return false;
            }

            inventory.put(t.charAt(i),
                    inventory.get(t.charAt(i)) - 1);
        }

        for (int count : inventory.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}