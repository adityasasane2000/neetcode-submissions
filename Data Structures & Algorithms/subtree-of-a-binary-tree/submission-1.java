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

    public boolean checkSubtree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;

        if(root == null || subRoot == null) return false;

        if(root.val != subRoot.val){
            return false;
        }

        return checkSubtree(root.left, subRoot.left) && checkSubtree(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;

        if(root == null || subRoot == null) return false;

        if(root.val != subRoot.val){
            boolean left = isSubtree(root.left, subRoot);

            if(left){
                return left;
            }

            boolean right = isSubtree(root.right, subRoot);

            if(right){
                return right;
            }
        }

        return checkSubtree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}


// 1 2 4 5 3

// 2 4 5
