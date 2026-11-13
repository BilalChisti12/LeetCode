class Solution {
    public int[] transformArray(int[] nums) {
        int zeroC=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0) zeroC++;
        }
        int idx=0;
        while(idx<zeroC){
            nums[idx++] = 0;
        }
        while(idx<nums.length){
            nums[idx++] = 1;
        }
        return nums;
    }
}