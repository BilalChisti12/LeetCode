class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean yes(int n){
        if(n==0) return false;
        int c=0;
        while(n!=0){
            c+=(n&1);
            n = n>>1;
        }
        return isPrime(c);
    }
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left; i<=right; i++){
            if(yes(i)) res++;
        }
        return res;
    }
}