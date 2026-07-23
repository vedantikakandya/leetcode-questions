/*
=========================================================
Problem #217: Contains Duplicate
Difficulty: Easy

Category:
- Arrays
- HashMap

Pattern:
- Frequency Counting

Approach:
- Create a HashMap to store the frequency of each element.
- Traverse the array and update the frequency of every number.
- Traverse the frequencies in the HashMap.
- If any frequency is greater than 1, return true.
- Otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Counting frequencies using HashMap.
- getOrDefault() simplifies frequency updates.
=========================================================
*/
package hashtable;
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int count : map.values()) {
            if (count > 1)
                return true;
        }

        return false;
    }
}