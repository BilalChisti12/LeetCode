class Solution {
    public String reverseWords(String s) {
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        int idx=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(idx<i){
                    stack.push(s.substring(idx, i));
                }
                while(i<s.length() && s.charAt(i) == ' ') i++;
                idx=i;
                i--;
            }
        }
        if(idx<s.length()){
            stack.push(s.substring(idx, s.length()));
        }
        while(!stack.isEmpty()){
            res.append(stack.pop()+" ");
        }
        return res.deleteCharAt(res.length()-1).toString();
    }
}