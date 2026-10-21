class Solution {
    public String largestOddNumber(String s) {
        int res=-1;
        int i=s.length()-1;
        while(i>=0){
            if((s.charAt(i)-'0')%2 !=0) return s.substring(0, i+1);
            i--;
        }
        return "";
    }
}