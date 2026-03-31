class Solution {
    public int numDecodings(String s) {
        int dp1 = 0;
        int dp2 = 1;
        if(s.charAt(s.length()-1)!='0') dp1=1;
        for(int i=s.length()-2;i>=0;i--){
            int sum=0;
            char ch = s.charAt(i);
            if(ch!='0'){
            sum=dp1;
            int num =0;
            num = Integer.valueOf(s.substring(i,i+2));
            if(num<=26&&num>0) sum=sum+dp2; 
              //System.out.println(sum+" "+dp1+" "+dp2+" "+num);
            }
          
            dp2=dp1;
            dp1=sum;                                          
        }
        return dp1;
    }
}
