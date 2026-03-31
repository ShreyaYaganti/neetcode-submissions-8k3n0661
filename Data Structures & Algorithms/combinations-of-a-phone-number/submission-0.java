class Solution {
    List<List<Character>>mobile;
    public List<String> letterCombinations(String digits) {
         mobile = new ArrayList<>();
         List<Character>l2 = new ArrayList<>();
         l2.add('a');
         l2.add('b');
         l2.add('c');
         mobile.add(l2);
          List<Character>l3 = new ArrayList<>();
         l3.add('d');
         l3.add('e');
         l3.add('f');
         mobile.add(l3);
          List<Character>l4 = new ArrayList<>();
         l4.add('g');
         l4.add('h');
         l4.add('i');
         mobile.add(l4);
          List<Character>l5 = new ArrayList<>();
         l5.add('j');
         l5.add('k');
         l5.add('l');
         mobile.add(l5);
          List<Character>l6 = new ArrayList<>();
         l6.add('m');
         l6.add('n');
         l6.add('o');
         mobile.add(l6);
          List<Character>l7 = new ArrayList<>();
         l7.add('p');
         l7.add('q');
         l7.add('r');
        l7.add('s');
         mobile.add(l7);
          List<Character>l8 = new ArrayList<>();
         l8.add('t');
         l8.add('u');
         l8.add('v');
         mobile.add(l8);
         List<Character>l9 = new ArrayList<>();
         l9.add('w');
         l9.add('x');
         l9.add('y');
         l9.add('z');
         mobile.add(l9);
        // System.out.println(mobile);
         char array[] = digits.toCharArray();
         List<String>ans = new ArrayList<>();
         helper(0,array,ans,"");
         return ans;
          
    }

    private void helper(int i, char[] array,List<String>ans,String sol){
         if(i>=array.length){if(sol!="")ans.add(sol);return;}
         int val = array[i]-'0';
        //  System.out.println(array[i]);
        //  System.out.println(val);
        List<Character>l = mobile.get(val-2);
         for(int j=0;j<l.size();j++){
            sol = sol+l.get(j);
            helper(i+1,array,ans,sol);
            sol = sol.substring(0,sol.length()-1);
         }

    }
}
