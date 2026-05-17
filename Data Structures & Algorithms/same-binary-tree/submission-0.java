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

    public void preOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            arr.add(101);
            return;
        }
        // 4 7 101 101 101

        // 4 101
        arr.add(root.val);
        preOrder(root.left, arr);
        preOrder(root.right, arr);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        preOrder(p, arr1);
        preOrder(q, arr2);

        if(arr1.size() != arr2.size()) return false;

        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i) != arr2.get(i)) return false;
        }

        return true;
    }
}
