class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        int l = 0;
        int max_len =0;
        for(int r=0;l<=r&&r<s.length();r++){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),r);
                max_len = Math.max(max_len,r-l+1);
                }
            else{
               int val = map.get(s.charAt(r));
                for(l=l;l<=val;l++){
                  map.remove(s.charAt(l));
                
                }
               // System.out.println(l+" "+r+ val);
                //map.put(s.charAt(l),l);
                max_len = Math.max(max_len,r-l+1);
            }
            map.put(s.charAt(r),r);
        }
        return max_len;
    }
}
