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

    // Helper method to recursively swap left and right children
    void swap(TreeNode curr) {
        if (curr == null) {
            return;
        }

        // Swap left and right
        TreeNode temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;

        // Recurse on left and right children
        swap(curr.left);
        swap(curr.right);
    }

    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
