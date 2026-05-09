class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int cnt = 1;

            for(int j=i+1;j<n;j++){
                if(nums[j] == nums[i]) cnt++;
            }

            if(cnt > (n/3)){
                if(!list.contains(nums[i]))
                    list.add(nums[i]);
            }
        }

        return list;
    }
}