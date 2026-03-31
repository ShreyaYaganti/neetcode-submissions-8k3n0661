class Solution {
    public int maxSubArray(int[] nums) {
        int l =0;
        int max=Integer.MIN_VALUE;
        int sum =0;
        for(int r=0;r<nums.length;r++){
            int val = nums[r];
            sum = sum+val;
           
            max=Math.max(max,sum);
             System.out.println(sum+" "+max);
            while(sum<0){
                sum=sum-nums[l];
                //max=Math.max(max,sum); 
                l++;
            }

        }
        return max;
    }
}
