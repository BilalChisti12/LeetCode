class Solution {
    public String largestOddNumber(String s) {
        int res=-1;
        int i=s.length()-1;
        while(i>=0){
            if(Integer.valueOf(s.charAt(i))%2 !=0) return s.substring(0, i+1);
            i--;
        }
        return "";
    }
}