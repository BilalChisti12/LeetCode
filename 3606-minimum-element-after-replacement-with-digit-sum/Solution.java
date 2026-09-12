class Solution {
    public int min(int n){
        int sum=0;
        if(n == 0) return 0;
        sum += n%10;
        sum += min(n/10);
        return sum;
    }
    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            res = Math.min(res, min(nums[i]));
        }
        return res;
    }
}