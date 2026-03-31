class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        for(int n:nums){
            if(map.containsKey(n)){
                continue;
            }
            int val =1;
            int lastval=n;
            int startval=n;
            
            if(map.containsKey(n+1)){
                val=val+map.get(n+1);
                lastval = n+1+map.get(n+1)-1;
            }
            if(map.containsKey(n-1)){
                val=val+map.get(n-1);
                startval = n-1-map.get(n-1)+1;
            }
            
            
            map.put(startval,val);
            map.put(lastval,val);
            map.put(n,val);
            ans=Math.max(ans,val);
             //System.out.println(map);
        }
       
        return ans;
    }
}
