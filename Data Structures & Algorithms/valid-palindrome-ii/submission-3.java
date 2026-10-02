class Solution {
    public boolean isPossible(String s, int flag){
        int i = 0;
        int j = s.length()-1;

        int skip = 0;

        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else if(skip == 0){
                if(flag == 1){
                    i++;
                }else{
                    j--;
                }
                skip++;
            }else{
                return false;
            }
        }

        return true;
    }
    
    public boolean validPalindrome(String s) {
        if(isPossible(s, 1)){
            return true;
        }else if(isPossible(s, 0)){
            return true;
        }

        return false;
    }
}