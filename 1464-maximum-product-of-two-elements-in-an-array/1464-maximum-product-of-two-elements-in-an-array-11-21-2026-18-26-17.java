class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int secMax = -2;
        int idx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                idx=i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i == idx) continue;
            if(nums[i] > secMax) secMax = nums[i];
        }
        return (max-1) * (secMax-1);
    }
}