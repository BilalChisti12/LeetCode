class Solution {
    public String largestOddNumber(String s) {
        int res=-1;
        int i=0;
        while(i<s.length()){
            if(Integer.valueOf(s.charAt(i))%2 !=0){
                res=i;
            }
            i++;
        }
        return res == -1 ? "" : s.substring(0, res+1);
    }
}