class Solution {
    public int numIslands(char[][] grid) {
        int[][] direct = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        int islands = 0;
        int ROW = grid.length;
        int COL = grid[0].length;
        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                if(grid[i][j]=='1'){
                    //System.out.println(i+" val"+j);
                    dfs(grid, i, j , ROW, COL, direct);
                      islands++;
                }
            }
        }
        return islands;
        
    }

    private void dfs(char[][] grid, int i, int j, int ROW, int COL, int[][] direct){
        if(i<0||j<0||i>=ROW||j>=COL||grid[i][j]=='0')return;
        grid[i][j]='0';
        for(int[]n : direct){
            //System.out.println(i+" "+j+"Directions "+(i+n[0])+" "+(j+n[1]));
            dfs(grid, i+n[0] , j+n[1], ROW, COL, direct);
        }
    }
}
