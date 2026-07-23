/*
=========================================================
Problem #26: Remove Duplicates from Sorted Array
Difficulty: Easy

Category:
- Arrays
- Two Pointers

Pattern:
- Two Pointers
- In-Place Array Manipulation

Approach:
- Since the array is already sorted, duplicate elements are adjacent.
- Maintain a pointer `j` that indicates the position where the next
  unique element should be placed.
- Traverse the array from index 1.
- If the current element is different from the previous one, place it
  at index `j` and increment `j`.
- After traversal, `j` represents the number of unique elements.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- A sorted array allows duplicates to be detected by comparing
  adjacent elements.
- Two pointers help modify the array in-place without extra memory.

Optimization:
- Already Optimal.

=========================================================
*/
package array;
class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}