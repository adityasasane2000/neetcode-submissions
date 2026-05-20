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
    public int helper(TreeNode root, int k, int[] arr){
        if(root == null){
            return -1;
        }

        if (root.left != null) {
            int left = helper(root.left, k, arr);
            if(left != -1){
                return left;
            }
        }

        if(arr[0] == k){
            return root.val;
        }
        arr[0]+=1;

        if(root.right != null){
            int right = helper(root.right, k, arr);
            if(right != -1){
                return right;
            }
        }

        return -1;
    }

    public int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[1];
        arr[0] = 1;

        return helper(root, k, arr);
    }
}
