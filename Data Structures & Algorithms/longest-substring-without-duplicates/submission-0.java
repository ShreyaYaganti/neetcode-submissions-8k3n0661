class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans=0;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int r=0;r<s.length();r++){
        if(map.containsKey(s.charAt(r))){
            int val = map.get(s.charAt(r));
            if(val>=l)l=val+1;
        }
        map.put(s.charAt(r),r);
         ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
