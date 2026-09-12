class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1 && s.charAt(0) != ' ') return 1;
        if(s.length() == 1 && s.charAt(0) == ' ') return 0;
        int res=0;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i-1) != ' ' && s.charAt(i) == ' '){
                res++;
                while(i<s.length() && s.charAt(i) == ' '){
                    i++;
                }
                continue;
            }
            i++;
        }
        if(s.charAt(s.length()-1)!=' ') res++;
        return res;
    }
}