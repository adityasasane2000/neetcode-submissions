class Solution {
    int[] dp;

    public int solve(String s, int idx){
        if(idx == s.length()){
            return 1;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        if(s.charAt(idx) == '0'){
            return 0;
        }

        int one = solve(s, idx+1);
        int two = 0;

        if(idx < s.length()-1){
            if(s.charAt(idx) == '1' || (s.charAt(idx) == '2' && s.charAt(idx+1) <= '6')){
                two+=solve(s, idx+2);
            }
        }

        return dp[idx] = one + two;
    }

    public int numDecodings(String s) {
        dp = new int[s.length()+1];

        Arrays.fill(dp, -1);
        return solve(s, 0);
    }
}
