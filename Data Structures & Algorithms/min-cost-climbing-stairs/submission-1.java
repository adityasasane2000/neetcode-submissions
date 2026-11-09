class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ans = Integer.MAX_VALUE;

        int[] dp = new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i] = -1;
        }

        for(int i=0;i<2;i++){
            int c = helper(i, n, cost, dp);
            ans = Math.min(ans, c);
        }

        return ans;
    }

    public int helper(int stidx, int n, int[] cost, int[] dp){
        if(stidx>=n){
            return 0;
        }

        if(dp[stidx] != -1) return dp[stidx];

        return dp[stidx] = cost[stidx] + Math.min(helper(stidx+1, n, cost, dp), helper(stidx+2, n, cost, dp));
    }
}
