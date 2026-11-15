class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];

        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        } 

        return solve(0, nums, -1, dp);
    }

    public int solve(int idx, int[] nums, int pickedIdx, int[][] dp){
        if(idx>=nums.length){
            return 0;
        }

        int originalPickedIdx = pickedIdx;

        if(pickedIdx != -1 && dp[idx][pickedIdx] != -1){
            return dp[idx][pickedIdx];
        }

        int pick = 0;

        if(pickedIdx == -1){
            pickedIdx = idx;
        }

        
        if((idx+1) % nums.length != pickedIdx){
            pick = nums[idx] + solve(idx+2, nums, pickedIdx, dp);
        }

        if (originalPickedIdx == -1){
            pickedIdx = -1;
        }

        int notpick = 0;
        notpick = 0 + solve(idx+1, nums, pickedIdx, dp);

        int ans = Math.max(pick, notpick);
        if(pickedIdx != -1) dp[idx][pickedIdx] = ans;
        return ans;
    }
}
