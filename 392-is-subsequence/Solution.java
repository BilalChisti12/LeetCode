class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            while(j<t.length() && t.charAt(j) != s.charAt(i)){
                j++;
            }
            if(j!=t.length() && t.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }
        }
        return i==s.length();
    }
}