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
    int max = Integer.MIN_VALUE;

    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        int all = left + right + root.val;
        int singleSideOnly = Math.max(left + root.val, right + root.val);
        int self = root.val;

        max = Math.max(max, Math.max(all, Math.max(singleSideOnly, self)));

        return Math.max(singleSideOnly, self);

    }

    public int maxPathSum(TreeNode root) {
        solve(root);

        return max;
    }
}
