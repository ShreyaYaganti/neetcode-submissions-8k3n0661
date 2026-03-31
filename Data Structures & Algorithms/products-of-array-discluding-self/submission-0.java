class Solution {
    public int[] productExceptSelf(int[] nums) {
        int L[] = new int[nums.length];
        int R[] = new int[nums.length];
        int ans[] = new int[nums.length];
        Arrays.fill(L,1);
        Arrays.fill(R,1);
        for(int i=1;i<ans.length;i++){
            L[i]=L[i-1]*nums[i-1];
        }
          for(int i=ans.length-2;i>=0;i--){
            R[i]=R[i+1]*nums[i+1];
        }
         for(int i=0;i<ans.length;i++){
            ans[i]=L[i]*R[i];
        }
        return ans;
    }
}  
