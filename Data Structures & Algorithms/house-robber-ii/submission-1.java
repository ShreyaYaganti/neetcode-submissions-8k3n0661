class Solution {
    public int rob(int[] nums) {
        int dp1 = 0;
        int dp2 =0;
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length-1;i++){
            int val = Math.max(dp2,dp1+nums[i]);
            dp1=dp2;
            dp2=val;
        }
        int rob1 =dp2;
        System.out.println(rob1);
        dp2=0;dp1=0;
        for(int i=1;i<nums.length;i++){
            int val = Math.max(dp2,dp1+nums[i]);
            dp1=dp2;
            dp2=val;
        }
        return Math.max(dp2,rob1);
    }
}
