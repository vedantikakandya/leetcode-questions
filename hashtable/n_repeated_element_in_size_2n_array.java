/*
=========================================================
Problem #961: N-Repeated Element in Size 2N Array
Difficulty: Easy

Category:
- Arrays
- HashMap

Pattern:
- Frequency Counting

Approach:
- Calculate n as half the size of the array.
- Create a HashMap to store the frequency of each element.
- Traverse the array and update the frequency of each element.
- After every update, check if the frequency becomes n.
- If yes, return that element immediately.
- If no such element is found, return -1.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- HashMap is useful for counting frequencies efficiently.
- Early return avoids unnecessary traversal once the required
  frequency is found.

Optimization:
- This solution is optimal in terms of time.
- There is also an O(1) space solution based on the problem's
  special property, but HashMap is simpler and easier to understand.

=========================================================
*/
package hashtable;
import java.util.HashMap;
class Solution {
    public int repeatedNTimes(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == n) {
                return num;
            }
        }

        return -1;
    }
}