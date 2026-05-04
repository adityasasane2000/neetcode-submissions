class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Character, Integer> temp = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String str = strs[i];

            if(str.length() == 1 && str.charAt(0) == '#'){
                continue;
            }

            ArrayList<String> list = new ArrayList<>();
            list.add(str);

            for(int j=0;j<str.length();j++){
                temp.put(str.charAt(j), temp.getOrDefault(str.charAt(j), 0)+1);
            }

            HashMap<Character, Integer> map = new HashMap<>(temp);

            for(int j=i+1;j<strs.length;j++){
                String s = strs[j];

                if(s.length() != str.length()) continue;

                int count = 0;

                for(int k=0;k<s.length();k++){
                    char ch = s.charAt(k);

                    if(map.containsKey(ch)){
                        map.put(ch, map.get(ch) - 1);

                        if(map.get(ch) == 0){
                            count++;
                        }else if(map.get(ch) < 0){
                            count--;
                        }
                    }else{
                        break;
                    }

                }

                if(map.size() == count){
                    strs[j] = "#";
                    list.add(s);
                }

                map = new HashMap<>(temp);
            }

            ans.add(list);
            temp.clear();
        }

        return ans;
    }
}


// a = 0
// c = 0
// t = 0