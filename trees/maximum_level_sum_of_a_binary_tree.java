/*
=========================================================
Problem #1161: Maximum Level Sum of a Binary Tree
Difficulty: Medium

Category:
- Trees
- Breadth-First Search (BFS)

Pattern:
- Level Order Traversal

Approach:
- Use a Queue to perform level order traversal.
- Process one level at a time.
- For each level:
    - Calculate the sum of all node values.
    - Add the children of the current level to the queue.
- Compare the current level sum with the maximum sum found so far.
- If the current level sum is greater, update the maximum sum and
  store the current level number.
- Return the level having the maximum sum.

Time Complexity: O(n)
Space Complexity: O(w)

where:
- n = number of nodes
- w = maximum width of the tree

Key Learning:
- BFS naturally processes nodes level by level.
- Queue size before each iteration gives the number of nodes
  present at the current level.
- Level Order Traversal is commonly used for problems involving
  tree levels.

Optimization:
- Already Optimal.

=========================================================
*/
package trees;
import java.util.LinkedList;
import java.util.Queue;


class Solution {

    public class TreeNode {  
    int val;
    TreeNode left;
    TreeNode right; 
    TreeNode() {} 
    TreeNode(int val) { this.val = val; } 
    TreeNode(int val, TreeNode left, TreeNode right) { 
        this.val = val; 
        this.left = left; 
        this.right = right; 
    } 
}
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int answerLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {

                TreeNode node = queue.poll();
                levelSum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum;
                answerLevel = level;
            }

            level++;
        }

        return answerLevel;
    }
}