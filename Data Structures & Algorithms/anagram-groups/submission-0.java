class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans = new ArrayList<>();
        List<int[]> freq= new ArrayList<>();
       
        for(String s :strs){
            int temp[] = new int[26];
            for(int k=0;k<s.length();k++){
               temp[s.charAt(k)-'a']++;
            }
            boolean match = false;
           for(int j=0;j<ans.size();j++){
            match = true;
             int[]a = freq.get(j);
             for(int i=0;i<26;i++){
                if(a[i]!=temp[i]){
                    match=false;
                    break;
                }
             }
             if(match==true){
                ans.get(j).add(s);
                break;
             }
           }
           if(match==false){
              List<String>l = new ArrayList<>();
              l.add(s);
              freq.add(temp);
              ans.add(l);
           }



        }
        return ans;
    }
}
