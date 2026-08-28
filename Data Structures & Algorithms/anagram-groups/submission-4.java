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

                if(innerStr == "#"){
                    continue;
                }
                
                int[] arr1 = new int[26];
                for(int l=0;l<innerStr.length();l++){
                    arr1[innerStr.charAt(l) - 'a']++;
                }

                int flag = 0;
                for(int m=0;m<26;m++){
                    if(arr[m] != arr1[m]){
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
