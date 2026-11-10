class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int i=0;
        for(int j=0; j<nums.length; j++){
            res[i] = nums[j];
            i++;
        }
        for(int j=0; j<nums.length; j++){
            res[i] = nums[j];
            i++;
        }
        return res;
    }
}