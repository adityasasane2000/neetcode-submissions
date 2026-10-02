class Solution {

    public boolean isPossible(String s, String rev, int flag){
        char skip = ' ';

        int i = 0;
        int j = 0;

        while(i<s.length() && j<rev.length()){
            if(s.charAt(i) == rev.charAt(j)){
                i++;
                j++;
            }else if(skip == ' '){
                if(flag == 0){                       
                    skip = rev.charAt(j);            
                    j++;                    
                }else{
                    skip = s.charAt(i);
                    i++;
                }
            }else{
                if(flag == 0){
                    if(s.charAt(i) == skip){
                        i++;
                    }else{
                        break;
                    }
                }else{
                    if(rev.charAt(j) == skip){
                        j++;
                    }else{
                        break;
                    }
                }
            }
        }

        if(i == s.length() || j == rev.length()){
            return true;
        }
            
        return false;
    }

    public boolean validPalindrome(String s) {
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        if(s == rev){
            return true;
        }

        if(isPossible(s,rev,1)){
            return true;
        }else if(isPossible(s,rev,0)){
            return true;
        }

        return false;
    }
}