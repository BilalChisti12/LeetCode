class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int d = 0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i) == '('){
                d++;
            }
            else if(s.charAt(i) == ')'){
                d--;
            }
            max = Math.max(max, d);
            i++;
        }
        return max;
    }
}