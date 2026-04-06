class Solution {
    int[][] neigh;
    public void solve(char[][] board) {
      int R = board.length;
      int C = board[0].length;
      //int visited[] = new int[R][C];
      neigh = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
      for(int i=0;i<R;i++){
        
       if(board[i][0]=='O'){
        
            find(board,R,C,i,0);
        }
        if(board[i][C-1]=='O'){
        //System.out.println(i+" "+board[i][C-1]);
            find(board,R,C,i,C-1);
        }
      }

      for(int j=0;j<C;j++){
         if(board[0][j]=='O'){
            find(board,R,C,0,j);
        }
        if(board[R-1][j]=='O'){
            find(board,R,C,R-1,j);
        }

      }
     // for(int[] node:board)

    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(board[i][j]=='O')board[i][j]='X';
            if(board[i][j]=='1')board[i][j]='O';
        }
    }








    }

    private void find(char[][]board,int R,int C,int x, int y){
        System.out.println("find"+x+" "+y);
        if(x<0||y<0||x>=R||y>=C||board[x][y]!='O')return;
        board[x][y]='1';
        for(int[]n:neigh){
            int n_x = x+n[0];
            int n_y = y+n[1];
            find(board,R,C,n_x,n_y);
        }
    }
}
