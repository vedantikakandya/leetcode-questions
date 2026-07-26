/*
=========================================================
Problem #485: Max Consecutive Ones
Difficulty: Easy

Category:
- Arrays

Pattern:
- Linear Traversal
- Running Count

Approach:
- Traverse the array from left to right.
- Maintain a counter to track consecutive 1's.
- If the current element is 1:
    - Increment the counter.
- Otherwise:
    - Reset the counter to 0.
- Update the maximum count after processing each element.
- Return the maximum consecutive count.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Running counters are useful for tracking consecutive occurrences.
- Update the maximum after every iteration to ensure no sequence is missed.
- Reset the counter whenever the sequence breaks.

Optimization:
- Already Optimal.

Common Mistake:
- Forgetting to update the maximum after incrementing the counter.

=========================================================
*/
package array;
class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int currentOnes = 0;
        int maxOnes = 0;

        for (int num : nums) {

            if (num == 1) {
                currentOnes++;
            } else {
                currentOnes = 0;
            }

            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return maxOnes;
    }
}