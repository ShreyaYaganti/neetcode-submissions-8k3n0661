class Solution {
  List<List<Integer>>ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          if(nums[i]<=target){
          List<Integer>list = new ArrayList<>();
          list.add(nums[i]);
           //System.out.println(list);
          backTrack(nums,target-nums[i],i,list);}
        }
        return ans;
    }

    public void backTrack(int[]nums, int target, int index, List<Integer>list){
        //System.out.println(target+" "+index+" "+list);
         if(target==0){
          //System.out.println(list+"List");
          ans.add(new ArrayList<>(list));}
          for(int i=index;i<nums.length;i++){
          if(nums[i]<=target){
          List<Integer>list2 = new ArrayList<>(list);
          list2.add(nums[i]);
          //System.out.println(list2+" "+index+" "+i+" "+(target-nums[i]));
          backTrack(nums,target-nums[i],i,list2);
          }
        }
    }
}
