class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse left subtree
        postorderHelper(node.left, result);
        // Traverse right subtree
        postorderHelper(node.right, result);
        // Visit the root node
        result.add(node.val);
    }
}