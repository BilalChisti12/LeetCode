class Solution {
    public int count1s(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1) count++;
            n = n>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        if(n == 0) return res;
        for(int i=1; i<=n; i++){
            res[i] = count1s(i);
        }
        return res;
    }
}