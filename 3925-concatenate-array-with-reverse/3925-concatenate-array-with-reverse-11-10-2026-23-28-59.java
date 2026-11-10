class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res = new int[nums.length*2];
        int idx=0;
        for(int i=0; i<nums.length; i++){
            res[idx++] = nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            res[idx++] = nums[i];
        }
        return res;
    }
}