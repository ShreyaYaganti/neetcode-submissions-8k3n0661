class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]>queue = new PriorityQueue<>((a,b)->a[0]-b[0]);
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int key :map.keySet()){
            queue.add(new int[]{map.get(key),key});
        }
        while(queue.size()>k){
            queue.poll();
        }
        int ans[]= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=queue.poll()[1];
        }
        return ans;
        
    }
}
