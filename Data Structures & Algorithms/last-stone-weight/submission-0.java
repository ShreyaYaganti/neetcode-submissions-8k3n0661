class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int stone:stones){
            queue.add(stone*-1);
        }
        while(!queue.isEmpty()){
            if(queue.size()==1)return queue.poll()*-1;
            int val1 = queue.poll();
            queue.add(val1-queue.poll());
        }

        return 0;
    }
}
