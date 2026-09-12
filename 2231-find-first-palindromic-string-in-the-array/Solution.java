class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        for(String s :words){
            StringBuilder s1 = new StringBuilder(s);
            if(s.equals(s1.reverse().toString())){
                result = s;
                break;
            }
        }
        return result;
    }
}