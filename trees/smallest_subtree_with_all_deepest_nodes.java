/*
=========================================================
Problem #865: Smallest Subtree with all the Deepest Nodes
Difficulty: Medium

Category:
- Trees
- Depth-First Search (DFS)

Pattern:
- Postorder Traversal
- Divide and Conquer

Approach:
- Perform a postorder DFS traversal.
- For each node, return:
    1. The deepest subtree rooted at that node.
    2. The depth of that subtree.
- Compare the depths of the left and right subtrees:
    - If the left subtree is deeper, return the left result.
    - If the right subtree is deeper, return the right result.
    - If both depths are equal, the current node is the lowest common
      ancestor of the deepest nodes.
- The node returned from the root call is the required answer.

Time Complexity: O(n)
Space Complexity: O(h)

where:
- n = number of nodes
- h = height of the tree

Key Learning:
- Postorder traversal processes children before the parent.
- Returning multiple values (node + depth) simplifies recursive tree
  problems.
- When left and right depths are equal, the current node becomes the
  answer.

Optimization:
- Already Optimal.

=========================================================
*/
package trees;

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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    private Pair dfs(TreeNode node) {

        if (node == null)
            return new Pair(null, 0);

        Pair left = dfs(node.left);
        Pair right = dfs(node.right);

        if (left.depth > right.depth)
            return new Pair(left.node, left.depth + 1);

        if (right.depth > left.depth)
            return new Pair(right.node, right.depth + 1);

        return new Pair(node, left.depth + 1);
    }

    static class Pair {

        TreeNode node;
        int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}