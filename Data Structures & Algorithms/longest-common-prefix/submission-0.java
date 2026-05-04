class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;

        for(int i=0;i<strs.length;i++){
            len = Math.min(strs[i].length(), len);
        }

        if(len == 0) return "";

        
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<len;i++){
            int flag =0;

            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }

        return sb.toString();

    }
}