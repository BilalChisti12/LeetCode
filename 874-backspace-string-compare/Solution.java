class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> s1 = new ArrayDeque<>();
        Deque<Character> s2 = new ArrayDeque<>();
        int i =0;
        int n = s.length();
        while(i!=n){
            if(s.charAt(i) == '#'){
                if(!s1.isEmpty()) s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
            i++;
        }
        i=0;
        n = t.length();
        while(i!=n){
            if(t.charAt(i) == '#'){
                if(!s2.isEmpty()) s2.pop();
            }
            else{
                s2.push(t.charAt(i));
            }
            i++;
        }
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek().equals(s2.peek())){
            s1.pop();
            s2.pop();
        }
        return s1.isEmpty()&&s2.isEmpty();
    }
}