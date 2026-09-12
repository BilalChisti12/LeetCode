import java.util.Arrays;
class Solution {
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static int lcm(int a,int b){
        if(a == 0 || b==0){
            return 0;
        }
        return a/gcd(a,b)*b;
    }
    public int subarrayLCM(int[] nums, int k) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            int lcm = 1;
            for(int j=i;j<nums.length; j++){
                lcm = lcm(lcm, nums[j]);
                if(lcm == k) count++;
                if(lcm > k) break;
            }
        }
        return count;
    }
}