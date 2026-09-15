class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int i=0;
        while(i!= s.length()){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}')){
                    stack.pop();
            }
            else{
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}