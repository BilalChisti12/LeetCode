class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int idx = r;
        int[] res = new int[r+1];
        while(l<=r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[idx--] = nums[l]*nums[l++];
            }
            else{
                res[idx--] = nums[r]*nums[r--];
            }
        }
        return res;
    }
}