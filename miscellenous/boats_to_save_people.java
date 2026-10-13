
/*
 * Problem: #881 - Boats to Save People
 * Difficulty: Medium
 * Category: Greedy
 * Pattern: Sorting + Two Pointers
 *
 * Approach:
 * 1. Sort people by weight.
 * 2. Use left for the lightest person and right for the heaviest.
 * 3. If their combined weight is within the limit, pair them.
 * 4. Always move right because the heaviest person gets a boat.
 * 5. Count each boat used.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n) auxiliary space for sorting,
 *                   depending on the sorting implementation.
 *
 * Key Learning:
 * Pair the heaviest person with the lightest person whenever
 * possible. Otherwise, the heaviest person travels alone.
 *
 * Common Mistake:
 * Forgetting that the heaviest person needs a boat even when
 * they cannot be paired with anyone.
 */

package miscellenous;
import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }
}