/*
=========================================================
Problem #682: Baseball Game
Difficulty: Easy

Category:
- Stack

Pattern:
- Stack Simulation

Approach:
- Traverse each operation in the given array.
- Maintain a Stack to store valid scores.
- Perform the following operations:
    - Integer → Push the score onto the stack.
    - "+" → Push the sum of the last two scores.
    - "D" → Push double the previous score.
    - "C" → Remove the previous score.
- After processing all operations, sum all the values in the stack.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Stack is useful for problems where only the most recent elements
  need to be accessed or modified.
- get(size - 1) retrieves the top element without removing it.
- pop() removes the latest valid score.

Optimization:
- Already Optimal.

=========================================================
*/
package stack;
import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {

                int last = stack.get(stack.size() - 1);
                int secondLast = stack.get(stack.size() - 2);
                stack.push(last + secondLast);

            } else if (op.equals("C")) {

                stack.pop();

            } else if (op.equals("D")) {

                stack.push(stack.peek() * 2);

            } else {

                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}