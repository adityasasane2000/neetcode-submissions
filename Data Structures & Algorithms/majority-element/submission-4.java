class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int no = nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i] == no){
                count++;
            }else{
                count--;
            }

            if(count==0){
                no = nums[i];
                count = 1;
            }
        }

        return no;
    }
}