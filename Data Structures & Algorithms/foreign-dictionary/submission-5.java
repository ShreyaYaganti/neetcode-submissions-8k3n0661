class Solution {
    public String foreignDictionary(String[] words) {
      HashMap<Character,Set<Character>>adj=new HashMap<>();
      Map<Character, Integer> indegree = new HashMap<>();
      //if(words.length==1)return "";
      for(String word:words){
         for (char c : word.toCharArray()) {
                adj.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }
        }
         System.out.println(adj);
        System.out.println(indegree); 
      
      //Arrays.fill(index,-1);
      for(int i=0;i<words.length-1;i++){
            int j=0;
            String val1 = words[i];
            String val2 = words[i+1];
             int minLen = Math.min(val1.length(), val2.length());
            if (val1.length() > val2.length() && 
                val1.substring(0, minLen).equals(val2.substring(0, minLen))) {
               // System.out.println(val1+" "+val2);
                return "";
            }
            while(j<val1.length()&&j<val2.length()){
                if(val1.charAt(j)!=val2.charAt(j)){
                     //Set<Character>set=adj.getOrDefault(val1.charAt(j),new HashSet<>());
                     if( !adj.get(val1.charAt(j)).contains(val2.charAt(j))){
                     adj.get(val1.charAt(j)).add(val2.charAt(j));
                     //adj.put(val1.charAt(j),set);
                     indegree.put(val2.charAt(j),indegree.get(val2.charAt(j))+1);}
                     //flag = false;
                     break;
                }
                j++;
            }
         }
       

         Queue<Character>queue = new LinkedList<>();
         for(char ch :indegree.keySet()){
            if(indegree.get(ch)==0){
                queue.add(ch);
            }
         }
         //if(queue.size()!=1)return "";
         String ans="";
         //int[] visited = new int[26];
         while(!queue.isEmpty()){
            char c = queue.poll();
            ans=ans+c;
            //visited[c-'a']=1;
             for(char neigh:adj.get(c)){
                   indegree.put(neigh,indegree.get(neigh)-1);
                   if(indegree.get(neigh)==0){
                  queue.add(neigh);
            }
             }
         }
         System.out.println(ans);
         if(ans.length()!=adj.size())return "";
         
        return ans;

   
    }
}
