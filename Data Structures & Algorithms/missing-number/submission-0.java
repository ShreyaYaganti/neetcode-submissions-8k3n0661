class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int val = ((n+1)*n)/2;
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        //System.out.println(sum);
        return val-sum;
    }
}
