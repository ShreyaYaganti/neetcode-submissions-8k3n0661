class KthLargest {
   PriorityQueue<Integer> queue;
   int K;
    public KthLargest(int k, int[] nums) {
       queue = new PriorityQueue<>();
       K =k;
        for(int num:nums){
            queue.add(num);
        }
        while(queue.size()>k){
            queue.poll();
        }
    }
    
    public int add(int val) {
         queue.add(val);
         while(queue.size()>K){
            queue.poll();
        }
        return queue.peek();

    }
}
