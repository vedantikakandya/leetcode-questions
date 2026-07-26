/*
=========================================================
Problem #136: Single Number
Difficulty: Easy

Category:
- Arrays
- Bit Manipulation

Pattern:
- XOR
- Bit Manipulation

Approach:
- Initialize a variable result = 0.
- Traverse every element in the array.
- XOR the current element with result.
- Since:
    a ^ a = 0
    a ^ 0 = a
- All duplicate numbers cancel each other out.
- The remaining value is the element that appears only once.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- XOR is useful for eliminating duplicate values.
- XOR is commutative and associative, so the order of elements does
  not matter.
- This approach avoids using extra data structures like HashMap or Set.

Optimization:
- Already Optimal.

Common Mistake:
- Using a HashMap or HashSet, which increases the space complexity
  to O(n).

=========================================================
*/
package bit_manupulation;
class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}