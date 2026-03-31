class KthLargest {
    PriorityQueue<Integer>minheap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        minheap = new PriorityQueue<>();
        for(int n:nums){
            minheap.add(n);
            if(minheap.size()>k){
               minheap.poll();
            }
        }
    }
    
    public int add(int n) {
        minheap.add(n);
           if(minheap.size()>k)
            minheap.poll();
        
        return minheap.peek();
    }
}
