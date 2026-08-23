class Solution {
    class Pair{
        int x;
        int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        Pair[] arr = new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = new Pair(i, nums[i]);
        }

        Arrays.sort(arr, Comparator.comparingInt(p -> p.y));

        int i = 0;
        int j = nums.length-1;

        while(i<=j){
            if(arr[i].y + arr[j].y == target){
                ans[0] = Math.min(arr[i].x, arr[j].x);
                ans[1] = Math.max(arr[j].x, arr[i].x);
                break;
            }else if(arr[i].y + arr[j].y < target){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
}

// -5 -4 -3 -2 -1
