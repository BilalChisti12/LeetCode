class Solution {
    public boolean checkRecord(String s) {
        int ac=0;
        int lc=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                lc++;
                if(lc>=3) return false;
            }
            else{
                lc=0;
            }
            if(s.charAt(i) == 'A') ac++;
        }
        return ac<2;
    }
}