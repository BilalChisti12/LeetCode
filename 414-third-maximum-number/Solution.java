class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secMax = max;
        long thMax = secMax;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>secMax && nums[i]<max){
                secMax = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>thMax && nums[i]<secMax){
                thMax = nums[i];
            }
        }
        return thMax == Long.MIN_VALUE ? (int)max : (int)thMax;
    }
}