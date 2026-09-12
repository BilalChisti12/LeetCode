import java.util.Stack;
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int idx =0;
        while(idx < sb.length()){
            char c = sb.charAt(idx);
            if(c == ')' && stack.isEmpty()){
                sb.deleteCharAt(idx);
                continue;
            }
            else if(c == ')' && stack.peek().charAt(stack.peek().length()-1) == '('){
                stack.pop();
            }
            else if(c == '('){
                stack.push(""+idx+c);
            }
            idx++;
        }
        while(!stack.isEmpty()){
            int n = Integer.parseInt(stack.peek().replaceAll("[^0-9]", ""));
            sb.deleteCharAt(n);
            stack.pop();
        }
        return sb.toString();
    }
}