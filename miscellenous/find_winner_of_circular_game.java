/*
 * Problem: #1823 - Find the Winner of the Circular Game
 * Difficulty: Medium
 * Category: Math
 * Pattern: Josephus Problem / Iterative Recurrence
 *
 * Approach:
 * 1. Start with winner = 0, representing the winner's
 *    zero-based index when there is only one person.
 * 2. For each circle size i from 1 to n, update the winner
 *    using (winner + k) % i.
 * 3. Convert the final zero-based index to a one-based
 *    position by adding 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * The winner's position for a larger circle can be calculated
 * from the winner's position for the previous, smaller circle.
 *
 * Common Mistake:
 * Forgetting that the recurrence uses zero-based indexing,
 * so the final answer must be incremented by 1.
 */

package miscellenous;
class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0;

        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }

        return winner + 1;
    }
}