/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
          List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        // Collect leaves from both trees
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        
        // Compare the leaf sequences
        return leaves1.equals(leaves2);
    }

    // Helper method to perform DFS and collect leaf values
    private void collectLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return; // Base case: if the current node is null, return
        }
        
        // If the node is a leaf, add its value to the list
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        } else {
            // Recursively collect leaves from left and right subtrees
            collectLeaves(node.left, leaves);
            collectLeaves(node.right, leaves);
        }

    }
}