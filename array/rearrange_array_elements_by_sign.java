/*
=========================================================
Problem #2149: Rearrange Array Elements by Sign
Difficulty: Medium

Category:
- Arrays

Pattern:
- Simulation
- Two Arrays

Approach:
- Create two separate arrays to store positive and
  negative numbers.
- Traverse the input array and place each element into
  its respective array.
- Merge both arrays by alternately taking one positive
  and one negative element.
- Return the rearranged array.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Separating elements into groups can simplify the
  rearrangement process.
- Merge techniques are useful when combining multiple
  collections in a specific order.

Optimization:
- Can be optimized by directly placing positive numbers
  at even indices and negative numbers at odd indices
  in the result array, eliminating the two temporary
  arrays.

Common Mistake:
- Forgetting that the number of positive and negative
  elements is equal.
- Incorrectly handling the merge indices.

=========================================================
*/
package array;
class Solution {

    public int[] rearrangeArray(int[] nums) {

        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int num : nums) {

            if (num < 0) {
                negative[negativeIndex++] = num;
            } else {
                positive[positiveIndex++] = num;
            }
        }

        return merge(positive, negative);
    }

    public static int[] merge(int[] positive, int[] negative) {

        int[] result = new int[positive.length * 2];

        int positiveIndex = 0;
        int negativeIndex = 0;
        int resultIndex = 0;

        while (positiveIndex < positive.length &&
               negativeIndex < negative.length) {

            result[resultIndex++] = positive[positiveIndex++];
            result[resultIndex++] = negative[negativeIndex++];
        }

        return result;
    }
}