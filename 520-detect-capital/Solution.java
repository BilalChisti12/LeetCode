class Solution {
    public boolean detectCapitalUse(String s) {
        int i=0;
        int flagc=0;
        while(i<s.length()){
            if(i>0 && Character.isUpperCase(s.charAt(i)) && flagc==0) return false;
            if(Character.isUpperCase(s.charAt(i))){
                flagc++;
            }
            i++;
        }
        if(flagc == s.length()) return true;
        if(flagc == 0) return true;
        if(flagc==1 && Character.isUpperCase(s.charAt(0))) return true;
        return false;
    }
}