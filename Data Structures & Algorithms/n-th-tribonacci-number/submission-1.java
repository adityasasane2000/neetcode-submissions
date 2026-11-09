class Solution {

    public int tribonacci(int n) {
        int[] dp = new int[38];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }

    public int solve(int n, int[] dp) {

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = solve(n - 3, dp) + solve(n - 2, dp) + solve(n - 1, dp);

        return dp[n];
    }
}