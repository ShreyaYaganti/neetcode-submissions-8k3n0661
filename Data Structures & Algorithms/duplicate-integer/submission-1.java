class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer>h = new HashSet<>();
      for(int i:nums){
        if(!h.add(i)){
          return true;
        }
        
      }
      return false;
    }
}
