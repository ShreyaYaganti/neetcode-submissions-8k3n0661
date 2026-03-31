class Solution {
    public int shortestPath(int[][] grid) {
          int ROW = grid.length;
          int COL = grid[0].length;
          int [][]visit = new int[ROW][COL];
          Deque<int[]> queue = new ArrayDeque<>();
          //add the first element
          queue.add(new int[3]);
          visit[0][0]=1;
          //int length=0;
          while(!queue.isEmpty()){
          int queueSize=queue.size();
        //  for(int i=0;i<queueSize;i++){
            int[] cord=queue.poll();
            int r= cord[0];
            int c = cord[1];
            int l = cord[2];
            if(r==ROW-1 && c== COL-1)return l;
            //move in 4 directions 
            int[][] neigbors = {{r,c+1,0},{r,c-1,0},{r+1,c,0},{r-1,c,0}};
            for(int[] j:neigbors){
                int nr = j[0]; int nc= j[1];
                if(nr<0||nc<0||nr>=ROW||nc>=COL||visit[nr][nc]==1||grid[nr][nc]==1)continue;
                visit[nr][nc]=1;
                j[2]=l+1;
                queue.add(j);
           // }
          }
             //length++;
           
          }
          return -1;
    }
}
