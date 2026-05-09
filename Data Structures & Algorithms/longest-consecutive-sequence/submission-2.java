class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            int dup = 0;
            int flag = 0;

            for(int j=i+1;j<nums.length; j++){
                if(nums[j] - nums[j-1] == 0){
                    dup++;
                }else if(nums[j] - nums[j-1] != 1){
                    ans = Math.max(ans, (j-i)-dup);
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                ans = Math.max(ans, (nums.length-i)-dup);
            }
        }

        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}


// -1 -1 0 1 3 4 5 6 7 8 9

// 2 2 3 4 5 10 20 