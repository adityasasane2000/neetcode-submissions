class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            List<String> list = new ArrayList<>();

            String str = strs[i];

            if(str == "#"){
                continue;
            }

            list.add(str);

            int[] arr = new int[26];
            for(int j=0;j<str.length();j++){
                arr[str.charAt(j) - 'a']++;
            }

            for(int k=i+1;k<strs.length;k++){
                String innerStr = strs[k];

                if(innerStr == "#" || innerStr.length() != str.length()){
                    continue;
                }
                
                int[] temp = arr.clone();
                int flag = 0;

                for(int l=0;l<innerStr.length();l++){
                    if(temp[innerStr.charAt(l) - 'a'] > 0){
                        temp[innerStr.charAt(l) - 'a']--;
                    }else{
                        flag = 1;
                        break;
                    }
                }

                if(flag == 0){
                    list.add(innerStr);
                    strs[k] = "#";
                }
            }

            ans.add(list);
        }

        return ans;
    }
}
