class Solution {
    public int myAtoi(String s) {
        int idx =0;
        int n = s.length();
        while(idx<n && s.charAt(idx) == ' '){
            idx++;
        }
        boolean neg = false;
        if(idx<n&& s.charAt(idx) =='-'){
            neg=true;
            idx++;
        }
        else if(idx<n && s.charAt(idx) == '+'){
            idx++;
        }
        long res = 0;
        for(int i=idx; i<n; i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)) break;
            int x = c-'0';
            res = (res+x) *10;
            if(!neg && res/10>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(neg && -(res/10)<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(neg) return (int)(-(res/10));
        return (int)(res/10);
    }
}