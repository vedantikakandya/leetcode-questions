/*
=========================================================
Problem #496: Next Greater Element I
Difficulty: Easy

Category:
- Stack
- Arrays

Pattern:
- Linear Search

Approach:
- Store all elements of nums2 in a Stack.
- For each element in nums1:
    - Find its index in the Stack.
    - Traverse all elements to its right.
    - Return the first element greater than the current element.
    - If no greater element exists, return -1.

Time Complexity: O(n × m)
Space Complexity: O(n)

Key Learning:
- Stack methods like indexOf() and get() can be used to access elements,
  but this does not utilize the stack's LIFO property.
- The solution works but is not the most efficient.

Optimization:
- This problem is optimally solved using a Monotonic Decreasing Stack
  with a HashMap in O(n + m) time.

=========================================================
*/
package stack;
import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums1.length];

        for (int num : nums2) {
            s.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = number(nums1[i], s);
        }

        return ans;
    }

    public int number(int target, Stack<Integer> s) {

        int index = s.indexOf(target);

        if (index + 1 >= s.size()) {
            return -1;
        }

        for (int i = index + 1; i < s.size(); i++) {
            if (s.get(i) > target) {
                return s.get(i);
            }
        }

        return -1;
    }
}