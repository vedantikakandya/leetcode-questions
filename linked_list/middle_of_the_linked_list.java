/*
=========================================================
Problem #876: Middle of the Linked List
Difficulty: Easy

Category:
- Linked List
- Two Pointers

Pattern:
- Fast & Slow Pointers (Tortoise and Hare)

Approach:
- Initialize two pointers:
    - slow moves one node at a time.
    - fast moves two nodes at a time.
- Traverse the linked list until fast reaches the end.
- By that time, slow will be pointing to the middle node.
- If the list has an even number of nodes, return the second middle node.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
- Fast and Slow pointers help solve Linked List problems efficiently.
- Moving one pointer twice as fast ensures the slower pointer reaches
  the middle when traversal ends.

Optimization:
- Already Optimal.

=========================================================
*/
package linked_list;

class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}