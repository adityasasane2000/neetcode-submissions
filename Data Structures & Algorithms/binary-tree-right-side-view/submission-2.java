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

        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);

        while(!q.isEmpty()){
            int size = q.size();
            ans.add(q.peekLast().val);

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    q.addLast(node.left);
                }

                if(node.right != null){
                    q.addLast(node.right);
                }
            }
        }

        return ans;
    }
}
