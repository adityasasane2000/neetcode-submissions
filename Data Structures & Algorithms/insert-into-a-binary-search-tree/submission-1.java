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
    public TreeNode helper(TreeNode root, int val){
        if(root == null) return null;

        if(val < root.val){
            TreeNode left = helper(root.left, val);

            if(left == null){
                root.left = new TreeNode(val);
                return root;
            }
        }else if(val > root.val){
            TreeNode right = helper(root.right, val);

            if(right == null){
                root.right = new TreeNode(val);
                return root;
            }
        }

        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        helper(root, val);
        return root;
    }
}