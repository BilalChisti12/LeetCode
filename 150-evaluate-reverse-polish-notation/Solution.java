class Solution {
    static int getRes(String s , String op, String t){
        int x = Integer.parseInt(s);
        int y = Integer.parseInt(t);
        switch(op){
            case "+":
                return x+y;
            case "-":
                return y-x;
            case "*":
                return x*y;
            case "/":
                return y/x;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        int i=0;
        while(i<tokens.length){
            if(tokens[i].length()>1 || Character.isDigit(tokens[i].charAt(0))){
                stack.push(tokens[i]);
            }
            else{
                String a = stack.pop();
                String b = stack.pop();
                int res = getRes(a, tokens[i], b);
                stack.push(String.valueOf(res));
            }
            i++;
        }
        int res = Integer.parseInt(stack.pop());
        return res;
    }
}