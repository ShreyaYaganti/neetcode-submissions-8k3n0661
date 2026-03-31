class Solution {
    public List<Integer> partitionLabels(String s) {
        int l = 0;
        int r=0;
        List<Integer>ans = new ArrayList<>();
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
          map.put(s.charAt(i),i);
        }
        //int l=0;
        int start=0;
        int end =0;
        while(l<=r &&r<s.length()&&r<=end){
           char c = s.charAt(r);
           end = Math.max(end,map.get(c));
           if(end==r){
              ans.add(r-l+1);
              l = r+1;
              end++;
           }
           r++;
          
        }
        return ans;


    }
}
