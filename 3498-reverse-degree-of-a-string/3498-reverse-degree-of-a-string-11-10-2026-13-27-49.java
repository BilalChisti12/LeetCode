class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++){
            int b = 27-(s.charAt(i)-'a'+1);
            res+= ((i+1)*b);
        }
        return res;
    }
}