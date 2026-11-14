class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];

        Arrays.fill(dp, -1);
        return solve(0, nums, dp);
    }

    public int solve(int idx, int[] nums, int[] dp){
        if(idx>=nums.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int pick = 0;
        pick = nums[idx] + solve(idx+2, nums, dp);

        int notpick = 0;
        notpick = 0 + solve(idx+1, nums, dp);

        int ans = Math.max(pick, notpick);
        dp[idx] = ans;
        return ans;
    }
}
