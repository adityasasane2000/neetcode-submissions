class Solution {
    public void swap(int[] nums, int pos, int idx){
        int temp = nums[idx];
        nums[idx] = nums[pos];
        nums[pos] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = n-1;

        int k = 0;
        while(k<n){
            if(nums[k] == 0 && i < k){
                swap(nums, i, k);
                i++;
            }else if(nums[k] == 2 && j > k){
                swap(nums, j, k);
                j--;
            }else{
                k++;
            }
        }
    }
}

// 0 1 2

// i = 0
// j = 1

// k = 2