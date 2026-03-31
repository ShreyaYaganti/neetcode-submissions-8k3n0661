class Solution {
    public int countPaths(int[][] grid) {
      return dfs(grid,0,0,new int[grid.length][grid[0].length]);
    }

    private int dfs(int[][]grid,int r, int c, int[][]visit){
        if(c<0||r<0||r==grid.length||c==grid[0].length||grid[r][c]==1||visit[r][c]==1){
            return 0;
        }
        if(c==grid[0].length-1&&r==grid.length-1)return 1;

        visit[r][c]=1;
        int count=0;
        count=count+dfs(grid,r+1,c,visit);
        count=count+dfs(grid,r-1,c,visit);
        count=count+dfs(grid,r,c+1,visit);
        count=count+dfs(grid,r,c-1,visit);
         visit[r][c]=0;
         return count;
    }
}
