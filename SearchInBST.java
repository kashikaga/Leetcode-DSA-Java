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
    public TreeNode searchBST(TreeNode root, int val) {
         // Base case: if root is null
        if (root == null) {
            return null;
        }
        
        // If the current node's value equals val, return this node
        if (root.val == val) {
            return root;
        }
        
        // If val is less than current node's value, search left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        } else { // If val is greater than current node's value, search right subtree
            return searchBST(root.right, val);
        }
    }
}