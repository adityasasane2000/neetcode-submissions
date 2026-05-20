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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        List<Integer> temp = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        temp.add(root.val);

        while(!q.isEmpty()){
            int size = q.size();
            ans.add(temp.get(temp.size()-1));

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    q.add(node.left);
                    temp.add(node.left.val);
                }

                if(node.right != null){
                    q.add(node.right);
                    temp.add(node.right.val);
                }
            }
        }

        return ans;
    }
}
