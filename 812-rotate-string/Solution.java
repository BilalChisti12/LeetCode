class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()) return false;
        String res = s+s;
        if(res.contains(goal)) return true;
        return false;
    }
}