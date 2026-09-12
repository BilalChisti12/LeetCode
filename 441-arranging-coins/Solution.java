class Solution {
    public int arrangeCoins(int n) {
        int s=0;
        int c=1;
        while(n>0){
            n-=c;
            s++;
            c++;
        }
        if(n<0) s--;
        return s;
    }
}