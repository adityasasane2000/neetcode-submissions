class Solution {
    public int[][] dp;

    public int isPalindrome(String s, int i, int j){
        if(i>=j){
            dp[i][j] = 1;
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = isPalindrome(s, i+1, j-1);
            return dp[i][j];
        }

        dp[i][j] = 0;
        return 0;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int sp = -1;

        dp = new int[1001][1001];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(isPalindrome(s, i, j) == 1){
                    if((j-i+1) > maxLen){
                        maxLen = j-i+1;
                        sp = i;
                    }
                }
            }
        }

        return s.substring(sp, sp+maxLen);
    }
}
