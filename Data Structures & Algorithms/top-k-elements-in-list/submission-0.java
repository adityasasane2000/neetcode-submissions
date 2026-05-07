class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(
            (p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()));

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> ent: map.entrySet()){
            pq.add(new Pair(ent.getKey(), ent.getValue()));
        }
        int[] ans = new int[k];
        int idx = 0;

        while(!pq.isEmpty() && k>0){
            ans[idx++] = pq.poll().getKey();
            k--;
        }

        return ans;
    }
}
