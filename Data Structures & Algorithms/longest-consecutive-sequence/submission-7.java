class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int ele : set){
            int prev = ele-1;

            if(!set.contains(prev)){
                int cnt = 1;
                int next = ele+1;

                while(set.contains(next)){
                    cnt++;
                    next = next + 1;
                }

                ans = Math.max(ans, cnt);
            }
        }

        return ans;
    }
}
