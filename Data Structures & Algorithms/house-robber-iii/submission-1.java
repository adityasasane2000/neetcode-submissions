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
    public Map<TreeNode, int[]> dp = new HashMap<>();

    public int helper(TreeNode root, int picked){
        if(root == null){
            return 0;
        }

        if (!dp.containsKey(root)) {
            dp.put(root, new int[]{-1, -1});
        }

        if(dp.get(root)[picked] != -1){
            return dp.get(root)[picked];
        }

        int pick = 0;
        if(picked == 0){
            pick = root.val + helper(root.left, 1) + helper(root.right, 1);
        }

        int notPick = helper(root.left, 0) + helper(root.right, 0);

        int ans = Math.max(pick, notPick);
        dp.get(root)[picked] = ans;
        return ans;
    }

    public int rob(TreeNode root) {
        return helper(root, 0);
    }
}

