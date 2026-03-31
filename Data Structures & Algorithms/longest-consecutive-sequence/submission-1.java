class Solution {
    public int longestConsecutive(int[] nums) {
        int length=0;
      HashSet<Integer>set = new HashSet<>();
      for(int i:nums){
         set.add(i);
      }
      for(int i:nums){
         if(!set.contains(i-1)){
          int j=i;
          int count=0;
         while(set.contains(j)){
            count++; //set.remove(j);
            j++;
         }
        length = Math.max(length,count);
      }
      }
       return length;
    }
}
