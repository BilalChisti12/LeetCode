class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z) == Math.abs(y-z)) return 0;
        return Math.min(Math.abs(x-z), Math.abs(y-z)) == Math.abs(x-z) ? 1 : 2;
    }
}