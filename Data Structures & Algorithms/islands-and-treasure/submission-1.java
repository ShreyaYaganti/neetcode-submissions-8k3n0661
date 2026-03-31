class Solution {
    public void islandsAndTreasure(int[][] grid) {
     Queue<int[]>queue = new LinkedList<>();
     int R = grid.length;
     int C = grid[0].length;
     int[][] visited = new int[R][C];
     for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(grid[i][j]==0){
                queue.add(new int[]{i,j});
                visited[i][j] =1;
            }
        }
     }
    int neigh[][] = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
     while(!queue.isEmpty()){
     int size = queue.size();
     int dis =0;
    // for(int i=0;i<size;i++){
        int[]node = queue.poll();
        for(int[]n:neigh){
            int x = node[0]+n[0];
            int y = node[1]+n[1];
            if(x<0||y<0||x>=R||y>=C||grid[x][y]==-1||visited[x][y]==1)continue;
            grid[x][y] = Math.min(grid[x][y],grid[node[0]][node[1]]+1);
            visited[x][y]=1;
            queue.add(new int[]{x,y});
        }

    // }


     }

        
    }
}
