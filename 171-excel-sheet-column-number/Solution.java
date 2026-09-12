class Solution {
    public int titleToNumber(String s) {
        int i=0;
        int res = 0;
        while(i<s.length()){
            res = res*26 + (s.charAt(i) - 'A' +1);
            i++;
        }
        return res;
    }
}