class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //find frequency
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int h:hand){
        map.put(h,map.getOrDefault(h,0)+1);
       }
       Arrays.sort(hand);
       int l=0;
       while(!map.isEmpty()&&l<hand.length){
          //get the smallest val 
          int small = hand[l];
          int val = small;
          for(int i=0;i<groupSize;i++){
             if(!map.containsKey(val+i))return false;
             else{
                 int freq = map.get(val+i);
                 if(freq-1==0)map.remove(val+i);
                 else map.put(val+i,freq-1);
             }
          }
          //now find the next smallest

          while(l<hand.length&&!map.containsKey(hand[l])){
              l++;
          }

       }

       return true;
        
    }
}
