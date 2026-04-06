class Solution {
    List<List<Integer>>ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        dfs(nums,0,new ArrayList<>());
        return ans;
    }

    private void dfs(int[]nums, int i,List<Integer>l){
       for(int j=i;j<nums.length;j++){
          List<Integer>n_l = new ArrayList(l);
          n_l.add(nums[j]);
          ans.add(n_l);
          dfs(nums,j+1,n_l);
       }
    }
}
