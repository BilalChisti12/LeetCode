class Solution {
    public boolean yes(String s, int l, int r){
        if(r<l) return true;
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return yes(s, l+1, r-1);
    }
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        return yes(s, 0, s.length()-1);
        
    }
}