class Solution {
    public List<Integer> formAList(int a, int b, int c){
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        return list;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int opp = nums[i] * (-1);
            for(int j=i+1;j<nums.length;j++){
                int req = opp - nums[j];
                if(map.containsKey(req)){
                    List<Integer> list = formAList(nums[i], nums[j], req);
                    if(!set.contains(list)){
                        ans.add(list);
                        set.add(list);
                    }
                }else{
                    map.put(nums[j], j);
                }
            } 

            map.clear();
        }

        return ans;
    }
}
