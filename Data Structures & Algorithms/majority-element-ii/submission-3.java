class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        if(n == 1){
            list.add(nums[0]);
            return list;
        }

        int cnd1 = nums[0];
        int cnt1 = 1;

        int cnd2 = -1;
        int cnt2 = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == cnd1){
                cnt1++;
            }else if(nums[i] == cnd2){
                cnt2++;
            }else if(cnt1 == 0){
                cnd1 = nums[i];
                cnt1 = 1;
            }else if(cnt2 == 0){
                cnd2 = nums[i];
                cnt2 = 1;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        int x = 0;
        int y = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == cnd1){
                x++;
            }else if(nums[i] == cnd2){
                y++;
            }
        }

        if(x > (n/3)) list.add(cnd1);
        if(y > (n/3)) list.add(cnd2);

        return list;
    }
}

// n = 9

// 7 5 5 5 6 7 7 7 5 
 
//  5    7
// ---- ---- -
// 5 -> 4
// 7 -> 4


// can1 = 5
// cnt1 = 0

// can2 = 2
// cnt2 = 4
