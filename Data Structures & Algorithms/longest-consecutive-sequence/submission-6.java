class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((no1, no2) -> Integer.compare(no2, no1));

        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], nums[i]);
                q.add(nums[i]);
            }
        }

        for(int i=0;i<n;i++){
            int prev = nums[i] - 1;
            if(map.containsKey(prev)){
                map.put(nums[i], prev);
            }
        }

        int len = 1;
        int ele = q.remove();
        // System.out.println(map.get(ele));
        int ans = 1;

        while(q.size() > 0){
            if(map.get(ele) == ele){
                ele = q.remove();
                ans = Math.max(ans, len);
                len = 1;
            }else{
                ele = map.get(ele);
                len++;
            }
        }

        ans = Math.max(ans, len);

        return ans;
    }
}


// 5 4 3 2
// 0 -> -1
// 2 -> 1
// 5 -> 4
// 4 -> -1
// 6 -> 5
// 1 -> 0
