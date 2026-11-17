class Solution {

    public boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int sp = -1;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(isPalindrome(s, i, j)){
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
