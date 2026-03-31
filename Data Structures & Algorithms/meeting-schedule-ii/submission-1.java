/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->a.start-b.start);
        List<Interval>lastmap = new ArrayList<>();
        for(Interval interval:intervals){
        if(lastmap.size()==0)lastmap.add(interval);
        else{
            int index=-1;
            //int i=0;
            for(int i=0;i<lastmap.size();i++){
                if(lastmap.get(i).end<=interval.start){
                   // System.out.println("hello");
                    lastmap.set(i,interval);
                    // System.out.println(lastmap);
                    index=i;
                    break;
                }
            }
            if(index==-1)lastmap.add(interval);

        }
        
        }
       // System.out.println(lastmap);
      return lastmap.size();

    }
}
