class Solution {
    public int climbStairs(int n) {
        int[][] dp = new int[n+1][n+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }

        return helper(n, 0, dp);
    }

    public int helper(int n, int sum, int[][] dp){
        if(sum == n){
            return 1;
        }else if(sum > n){
            return 0;
        }

        if(dp[n][sum] != -1){
            return dp[n][sum];
        }

        int ans = helper(n, sum+1, dp) + helper(n, sum+2, dp);
        dp[n][sum] = ans;
        return ans;
    }
}
