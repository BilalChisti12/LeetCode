class Solution {
    public int calPoints(String[] operations) {
        Deque<String> stack = new ArrayDeque<>();
        int res=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                String a = stack.pop();
                String b = stack.peek();
                int sum = Integer.parseInt(a)+Integer.parseInt(b);
                res+=sum;
                stack.push(a);
                stack.push(String.valueOf(sum));
            }
            else if(operations[i].equals("D")){
                int a = Integer.parseInt(stack.peek()) *2;
                stack.push(String.valueOf(a));
                res+=a;
            }
            else if(operations[i].equals("C")){
                int a = Integer.parseInt(stack.pop());
                res-=a;
            }
            else{
                stack.push(operations[i]);
                res+=Integer.parseInt(operations[i]);
            }
        }
        return res;
    }
}