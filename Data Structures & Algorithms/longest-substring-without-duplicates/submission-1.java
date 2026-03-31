class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l, r,max_len;
        l=0;
        r=0;
        max_len=0;
        HashMap<Character,Integer>duplicate= new HashMap<>();
        // if(s.length()!=0){
        //     max_len=1;
        //     duplicate.put(s.charAt(l),0);
        // }
        int len =0;
        while(r<s.length()&&l<=r){
            char c = s.charAt(r);
            if(!duplicate.containsKey(c)){
                duplicate.put(c,r);
                max_len = Math.max(max_len,r-l+1);
                //System.out.println(r+" "+l+" "+max_len);
                r++;
            }
            else{
                int val = duplicate.get(c)+1;
                l=val;
                duplicate = new HashMap<>();
                int p =val;
                while(p<=r&&l<=p){
                    duplicate.put(s.charAt(p),p);
                    max_len = Math.max(max_len,p-l+1);
                    p++;
                }
               
                r++;
            }



        }
        return max_len;
        
    }
}
