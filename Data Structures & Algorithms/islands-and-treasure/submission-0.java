class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>queue = new LinkedList<>();
        int R = grid.length;
        int C = grid[0].length;
       // int[][] visit = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==0){queue.add(new int[]{i,j});
                //visit[i][j]=1;
                }
            }
        }
        int[][] neigh = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
              int[] pair = queue.poll();
              int r = pair[0]; int c = pair[1];
              for(int[]n:neigh){
                int nr = r+n[0];
                int nc = c+n[1];
                if(nr<0||nc<0||nr>=R||nc>=C||grid[nr][nc] != Integer.MAX_VALUE){
                    continue;
                }
                //visit[nr][nc]=1;
                //System.out.println(r+""+c+" "+nr+" "+nc+" "+(grid[r][c]+1));
                queue.add(new int[]{nr,nc});
                grid[nr][nc]=grid[r][c]+1;
              }
        }
    }
}
