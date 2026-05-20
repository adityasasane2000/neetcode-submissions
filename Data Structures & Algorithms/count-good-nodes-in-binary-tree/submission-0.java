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
    public int helper(TreeNode root, int max){
        if(root == null){
            return 0;
        }

        int ans = 0;

        if(root.val >= max){
            ans = 1 + helper(root.left, root.val) + helper(root.right, root.val);
        }else{
            ans = helper(root.left, max) + helper(root.right, max);
        }

        return ans;
    }

    public int goodNodes(TreeNode root) {
        return helper(root, -101);
    }
}


//    3
//  3   N
// 4 2
