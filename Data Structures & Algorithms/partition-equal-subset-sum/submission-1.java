class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int num:nums){
            sum = sum+num;
        }
        if(sum%2!=0)return false;
        sum = sum/2;
        return canSum(nums,0,sum);
        
    }

    private boolean canSum(int[]nums, int i,int sum){
        if(i<0||i>=nums.length||sum<0)return false;
        if(sum==0)return true;
        return canSum(nums,i+1,sum-nums[i])||canSum(nums,i+1,sum);
    }
}
