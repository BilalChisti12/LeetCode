class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        long l=1;
        long r=num;
        while(l<r){
            long m = l+(r-l)/2;
            if(m*m == num) return true;
            if(m*m > num) r=m;
            else l=m+1;
        }
        return false;
    }
}