class Solution {
    public int rob(int[] nums) {
        int dp1 = 0;
        int dp2 = 0;
        for(int num:nums){
            int val = Math.max(dp2,dp1+num);
            dp1=dp2;
            dp2=val;
        }
        return dp2;
    }
}
