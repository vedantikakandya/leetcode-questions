/*
=========================================================
Problem #169: Majority Element
Difficulty: Easy

Category:
- Arrays
- Hashing

Pattern:
- Frequency Counting
- HashMap

Approach:
- Use a HashMap to count the frequency of every element.
- Traverse the array and update the frequency.
- Since the majority element appears more than n/2 times,
  iterate through the map and return the element whose
  frequency exceeds n/2.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- HashMap is useful for frequency counting.
- The majority element is guaranteed to exist.
- Frequency counting is often the simplest approach.

Optimization:
- Can be optimized to O(1) space using Boyer-Moore Voting Algorithm.

Common Mistake:
- Returning the frequency instead of the element.
- (A common bug in this problem.)


Even better solution (asked in interviews)
This problem has an O(n) time, O(1) space solution called the Boyer-Moore Voting Algorithm.
=========================================================
*/
package hashtable;
import java.util.HashMap;
class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int limit = nums.length / 2;

        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() > limit) {
                return entry.getKey();
            }
        }

        return -1;
    }
}