class Solution {
    public int countComponents(int n, int[][] edges) {
      int[] visited = new int[n];
      HashMap<Integer,List<Integer>>map = new HashMap<>();
      for(int[] edge:edges){
        List<Integer>list = map.getOrDefault(edge[0],new ArrayList<>());
        list.add(edge[1]);
        map.put(edge[0],list);
        List<Integer>list1 = map.getOrDefault(edge[1],new ArrayList<>());
        list1.add(edge[0]);
        map.put(edge[1],list1);
      }
      System.out.println(map);
      int l =0;
      int count=0;
      Queue<Integer>queue = new LinkedList<>();
      while(l<n){
      queue.add(l);
      visited[l]=1;
      while(!queue.isEmpty()){
        int node = queue.poll();
        List<Integer>list = map.getOrDefault(node,new ArrayList<>());
        for(int val:list){
           if(visited[val]==0){
            queue.add(val);
            visited[val]=1;
           }
        }
      }
      count++;
      while(l<n&&visited[l]==1){
        l++;
      }
      

      }
    return count;
    }
}
