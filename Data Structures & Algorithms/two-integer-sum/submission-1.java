class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int req = target - nums[i];

            if(map.containsKey(req)){
                return new int[]{map.get(req), i};
            }

            map.put(nums[i], i);
        }

        return new int[2];

    }
}

// 3 4 4 6

// i = 0;
// j = 1;