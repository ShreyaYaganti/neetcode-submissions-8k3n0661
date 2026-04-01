class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int temp = temperatures[i];
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temp){
                int j = stack.pop();
                result[j] = i-j;
            }
            stack.push(i);
        }
        return result;
    }
}
