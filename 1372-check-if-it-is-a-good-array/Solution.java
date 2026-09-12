class Solution {
    static int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
    public boolean isGoodArray(int[] nums) {
        int gcd =0;
        for(int j=0; j<nums.length; j++){
            gcd = gcd(gcd, nums[j]);
            if(gcd == 1){
                return true;
            }
        }
        return false;
    }
}