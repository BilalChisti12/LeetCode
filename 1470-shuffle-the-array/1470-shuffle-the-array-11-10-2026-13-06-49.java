class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=nums.length/2;
        int[] res = new int[nums.length];
        int idx=0;
        while(j<nums.length){
            res[idx++] = nums[i++];
            res[idx++] = nums[j++];
        }
        return res;
    }
}