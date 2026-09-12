class Solution {
    public int[] productExceptSelf(int[] nums) { 
        int product = 1;
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) zeroCount++;
            if(nums[i] != 0){
                product*=nums[i];
            }
        }
        if(zeroCount>1){
            for(int i=0; i<nums.length; i++){
                nums[i] = 0;
            }
            return nums;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && zeroCount == 1){
                nums[i] = 0;
            }
            else if(nums[i] == 0 && zeroCount == 1){
                nums[i] = product;
            }
            else{
                nums[i] = product/nums[i];
            }
        }
        return nums;
    }
}