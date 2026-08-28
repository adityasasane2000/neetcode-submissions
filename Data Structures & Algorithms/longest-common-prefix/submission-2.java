class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int len = strs[0].length();

        for(int i=0;i<len;i++){
            int flag = 0;

            for(int j=1;j<strs.length;j++){
                if(strs[j].length() <= i || strs[0].charAt(i) != strs[j].charAt(i)){
                    flag = 1;
                    break;
                }
            }

            if(flag == 1){
                break;
            }else{
                sb.append(strs[0].charAt(i));
            }
        }

        return sb.toString();
    }
}

// O(Min(str.length) * strs.length);