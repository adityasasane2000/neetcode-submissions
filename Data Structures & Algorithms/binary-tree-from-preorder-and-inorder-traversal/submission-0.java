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
    HashMap<Integer, Integer> map = new HashMap<>();

    public void fillTree(int val, TreeNode root){
        int rootIdx = map.get(root.val);
        int valIdx = map.get(val);

        if(valIdx < rootIdx){
            if(root.left == null){
                root.left = new TreeNode(val);
            }else{
                fillTree(val, root.left);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                fillTree(val, root.right);
            }
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        for(int i=1;i<preorder.length;i++){
            int idx = map.get(preorder[i]);
            fillTree(preorder[i], root);
        }

        return root;
    }
}

// 8 4 9 2 5 1 6 3 7
// 1 2 3 4 5 6 7 8 9


// 4 5 6 2 1 3
// 1 2 3 4 5 6


