class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>>ans = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           int target = nums[i]*-1;
           int l =i+1;
           int r = nums.length-1;
           while(l<nums.length&&l<r){
              int sum = nums[l]+nums[r];
              if(target==sum){
                List<Integer>list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                ans.add(list);
                int left = nums[l];
                int right = nums[r];
                while(l<nums.length&&left==nums[l])l++;
                while(r>=0&&right==nums[r])r--;
              }
              else if(target>sum)l++;
              else r--;
           }
          // int val = nums[i];
           while(i+1<nums.length&&nums[i]==nums[i+1]){
               i++;
           }
           

       }
       return ans;
    }
}
