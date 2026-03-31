class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length-1;
        int ans=0;
        while(l<r){
            int h1 = heights[l];
            int h2 = heights[r];
            int area = Math.min(h1,h2)*(r-l);
            ans = Math.max(area,ans);
            if(h1<h2){
                l++;
            }
            else r--;
        }
        return ans;
    }
}
