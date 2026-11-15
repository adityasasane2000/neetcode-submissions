class Solution {

    int[][] dp;
    String ans = "";

    public boolean isPalindrome(String s, int i, int j) {

        if (i >= j) return true;

        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        if (s.charAt(i) != s.charAt(j)) {
            dp[i][j] = 0;
            return false;
        }

        dp[i][j] = isPalindrome(s, i + 1, j - 1) ? 1 : 0;

        return dp[i][j] == 1;
    }

    public String longestPalindrome(String s) {

        int n = s.length();

        dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        solve(s, 0);

        return ans;
    }

    public void solve(String s, int start) {

        if (start >= s.length()) return;

        for (int end = start; end < s.length(); end++) {

            if (isPalindrome(s, start, end)) {

                if (end - start + 1 > ans.length()) {
                    ans = s.substring(start, end + 1);
                }
            }
        }

        solve(s, start + 1);
    }
}