class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int idx = 0;
        
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                arr[idx++] = 0;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                arr[idx++] = 1;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i] == 2){
                arr[idx++] = 2;
            }
        }

        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }
    }
}