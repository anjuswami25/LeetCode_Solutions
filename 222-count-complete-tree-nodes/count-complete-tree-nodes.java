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
      int count=0;
    public int countt(TreeNode root){
        if(root==null){
            return 0;
        }
        count=count+1;
        countt(root.left);
        countt(root.right);
        return count;



        
            
        }
    



    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        countt(root);
        return count;
        
    }
}
