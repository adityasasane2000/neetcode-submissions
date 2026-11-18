class Solution {
    int[] dp;
    public boolean isPossible(String str, int i, int j){

        if(j>=str.length()){
            j = str.length()-1;
        }

        String s = str.substring(i, j+1);
        int no = Integer.parseInt(s);

        if(no>=1 && no<=26){
            return true;
        }

        return false;
    }

    public int solve(String str, int idx){
        if(idx >= str.length()-1){
            if(idx == str.length()-1 && str.charAt(idx) == '0'){
                return 0;
            }
            return 1;
        }

        if(str.charAt(idx) == '0'){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int x = 0;
        if(isPossible(str, idx, idx+1)){
            x+=solve(str, idx+2);
        }

        int y = solve(str, idx+1);
        return dp[idx] = x+y;
    }

    public int numDecodings(String s) {
        if(s.charAt(0) == '0'){
            return 0;
        }

        dp = new int[101];

        Arrays.fill(dp, -1);

        int cnt = 0;
        cnt+=solve(s, 0);

        return cnt;
    }
}

// (2 1 2)
// (21 2)
// (2 12)