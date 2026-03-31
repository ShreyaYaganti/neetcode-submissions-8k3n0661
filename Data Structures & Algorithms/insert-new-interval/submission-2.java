class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
          List<int[]>ans = new ArrayList<>();
          boolean flag = false;
          for(int[] interval:intervals){
            if(!isOverlapping(interval,newInterval)){
                if(newInterval[0]<interval[0]&&!flag){
                    ans.add(newInterval);
                    flag = true;
                }
                ans.add(interval);
            }
            else{
                newInterval = new int[]{Math.min(newInterval[0],interval[0]),Math.max(newInterval[1],interval[1])};

            }
          }

          if(flag==false){
             ans.add(newInterval);
          }

          return ans.stream().toArray(int[][]::new);
        
    }

    public boolean isOverlapping(int[]interval1 ,int[]interval2){
        if(interval1[0]<interval2[0]){
            if(interval1[1]<interval2[1]&&interval1[1]<interval2[0]){
                return false;
            }
        }
        else if(interval1[0]>interval2[0]){
            if(interval2[1]<interval1[1]&&interval2[1]<interval1[0]){
                return false;
            }
        }
        return true;
        
    }
}
