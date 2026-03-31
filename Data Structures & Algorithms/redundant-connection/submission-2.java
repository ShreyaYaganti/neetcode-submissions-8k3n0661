class Solution {
     int parent[];
     int rank[];
    public int[] findRedundantConnection(int[][] edges) {
        //Lets find no of rows
    parent = new int[edges.length + 1];
    rank = new int[edges.length + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 1;
        }

        for(int []edge:edges){
            if(!merge(edge)) return edge;
        }
        return new int[0];
       
    }

    private int find(int node){
       if(parent[node]==node)return node;
       return find(parent[node]);
    }

    private boolean merge(int[]edge){
        int p1 = find(edge[0]);
        int p2 = find(edge[1]);
        if(p1==p2)return false;
        if(rank[p1]>rank[p2]){
            parent[p2] = p1;
            rank[p1] = rank[p1]+rank[p2];
        }
        else{
            parent[p1] = p2;
            rank[p2] = rank[p1]+rank[p2];
        }
        return true;
    }
}


