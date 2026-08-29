class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        
        int i = 0;
        int j = n-1;

        int k = 0;
        while(i<=j){

            if(i == j){
                if(nums[i] != val) k++;
                break;
            }

            while(i<n && i<j && nums[i] != val){
                i++;
                k++;
            }

            while(j>=0 && i<j && nums[j] == val){
                j--;
            }

            if(i<n && j>=0 && nums[j] != val){
                nums[i] = nums[j];
                i++;
                j--;
                k++;
            }
        }

        return k;
    }
}