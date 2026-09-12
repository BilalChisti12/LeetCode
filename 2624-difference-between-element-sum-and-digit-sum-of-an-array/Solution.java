class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int n: nums){
            sum+=n;
            // int n1=n;
            for(int temp = n; temp>0; temp/=10){
                digitSum += temp%10;
            }
        }
        
        return Math.abs(sum-digitSum);
    }
}