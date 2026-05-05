class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;

        while(i<nums.length && i<=j){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }else{
                i++;
            }
        }

        return j+1;
    }
}

// 4 3 5 1 1

// i = 3
// j = 2