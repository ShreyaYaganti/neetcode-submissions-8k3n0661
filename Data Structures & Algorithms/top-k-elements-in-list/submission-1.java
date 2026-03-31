class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>ans = new ArrayList<>();
        List<Integer> freq[] = new ArrayList[nums.length];
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int n :nums){
         map.put(n,map.getOrDefault(n,0)+1);
        }
        map.forEach((key,value)->{
            if(freq[value-1]==null)freq[value-1]=new ArrayList<>();
            freq[value-1].add(key);
        });
        int c = nums.length-1;
         while(k>0){
             if(freq[c]!=null&&freq[c].size()!=0){
                int len =0;
                while(k>0&&len<freq[c].size()){
                    ans.add(freq[c].get(len));
                    len++;
                    k--;
                }
             }
             c--;
         }
         int a[] = new int[ans.size()];
         for(int i=0;i<ans.size();i++){
            a[i]=ans.get(i);
         }
         return a;
    }
}
