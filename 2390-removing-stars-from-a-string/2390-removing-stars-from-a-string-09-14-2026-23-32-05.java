class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*') stack.pop();
            else stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.insert(0, c);
        }
        return sb.toString();
    }
}