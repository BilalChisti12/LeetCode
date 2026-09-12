class Solution {
    public int pivotInteger(int n) {
        double res = Math.sqrt((n*(n+1))/2);
        if(res == Math.floor(res)) return (int)res;
        return -1;
    }
}