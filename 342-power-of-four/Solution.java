class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        double root = Math.sqrt(n);
        int round = (int)Math.round(root);
        if(round*round != n) return false;
        return (round & (round-1)) == 0;
    }
}