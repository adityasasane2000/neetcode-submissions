class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0;i<n;i++){
            sum+=nums[i];

            int req = sum - k;
            if(map.containsKey(req)){
                count+=map.get(req);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        

        return count;
    }
}

// 0,1
// 2,2
// 1,1 

// sum = 4
// count = 2
// i = 3
