class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int req = target - numbers[i];
            if(map.containsKey(req)){
                ans[0] = Math.min(i, map.get(req))+1;
                ans[1] = Math.max(i, map.get(req))+1;
                return ans;
            }else{
                map.put(numbers[i], i);
            }
        }

        return ans;
    }
}
