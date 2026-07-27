/*
=========================================================
Problem #1464: Maximum Product of Two Elements in an Array
Difficulty: Easy

Category:
- Arrays

Pattern:
- Maximum Element Tracking
- One Pass

Approach:
- Traverse the array once.
- Maintain the largest and second largest elements.
- If the current element is greater than or equal to the
  largest element:
    - Update the second largest element.
    - Update the largest element.
- Otherwise, update the second largest element if needed.
- Return (largest - 1) × (secondLargest - 1).

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Multiple maximum values can be tracked in a single traversal.
- One-pass solutions are more efficient than sorting.
- This technique is useful whenever only the top few elements
  are required.

Optimization:
- Already Optimal.

Common Mistake:
- Forgetting to update the second largest element when a new
  maximum is found.
- Sorting the array unnecessarily, resulting in O(n log n)
  time complexity.

=========================================================
*/
package array;
class Solution {

    public int maxProduct(int[] nums) {

        int largest = 0;
        int secondLargest = 0;

        for (int num : nums) {

            if (num >= largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return (largest - 1) * (secondLargest - 1);
    }
}