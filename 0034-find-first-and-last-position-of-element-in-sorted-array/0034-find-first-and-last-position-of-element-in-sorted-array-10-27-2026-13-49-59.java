class Solution {
    public int[] searchRange(int[] nums, int target) {
        int minIdx = nums.length;
        int maxIdx = -1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m] == target){
                minIdx = Math.min(minIdx, m);
                r=m-1;
            }
            else if(nums[m] <target) l=m+1;
            else r=m-1;
        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m] == target){
                maxIdx = Math.max(maxIdx, m);
                l=m+1;
            }
            else if(nums[m] < target) l=m+1;
            else r=m-1;
        }
        minIdx = minIdx == nums.length ? -1 : minIdx;
        int[] res = new int[2];
        res[0] = minIdx;
        res[1] = maxIdx;
        return res;
    }
}