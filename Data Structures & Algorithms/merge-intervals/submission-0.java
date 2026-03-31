class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ans.add(intervals[0]);
        for(int[]interval:intervals){
            int[]newval = ans.get(ans.size()-1);
           if(interval[0]>newval[1]){
            ans.add(interval);
           }
           else{
              ans.get(ans.size()-1)[0] = Math.min(newval[0],interval[0]);
              ans.get(ans.size()-1)[1] = Math.max(newval[1],interval[1]);
           }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    
    }

