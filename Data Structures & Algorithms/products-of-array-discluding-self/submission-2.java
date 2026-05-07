class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int zero = 0;

        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                prod*=nums[i];
            }

            if(nums[i] == 0){
                zero++;
            }
        }

        for(int i=0;i<n;i++){
            if(zero == 1 && nums[i] == 0){
                ans[i] = prod;
            }else if(zero > 1 && nums[i] == 0){
                ans[i] = 0;
            }else if(zero > 0 && nums[i] != 0){
                ans[i] = 0;
            }else if(zero == 0){
                ans[i] = prod/nums[i];
            }
        }

        return ans;
    }
}  
