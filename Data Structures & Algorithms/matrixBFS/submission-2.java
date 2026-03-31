class Solution {
    public int shortestPath(int[][] grid) {
          int ROW = grid.length;
          int COL = grid[0].length;
          int [][]visit = new int[ROW][COL];
          Deque<int[]> queue = new ArrayDeque<>();
          //add the first element
          queue.add(new int[2]);
          visit[0][0]=1;
          int length=0;
          while(!queue.isEmpty()){
          int queueSize=queue.size();
          for(int i=0;i<queueSize;i++){
            int[] cord=queue.poll();
            int r= cord[0];
            int c = cord[1];
            if(r==ROW-1 && c== COL-1)return length;
            //move in 4 directions 
            int[][] neigbors = {{r,c+1},{r,c-1},{r+1,c},{r-1,c}};
            for(int[] j:neigbors){
                int nr = j[0]; int nc= j[1];
                if(nr<0||nc<0||nr>=ROW||nc>=COL||visit[nr][nc]==1||grid[nr][nc]==1)continue;
                visit[nr][nc]=1;
                queue.add(j);
            }
          }
             length++;
           
          }
          return -1;
    }
}
