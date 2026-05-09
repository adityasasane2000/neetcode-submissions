class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int pick = nums[0];
        int last_profit = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] - pick > last_profit){
                last_profit = nums[i] - pick;
            }else{
                profit+=last_profit;
                pick = nums[i];
                last_profit = 0;
            }
        }

        if(last_profit != 0) profit+=last_profit;

        return profit;
    }
}


// 7 1 2 4 8 4

// 7

