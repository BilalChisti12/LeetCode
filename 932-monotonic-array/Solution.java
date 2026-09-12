class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;
        int i = 1;
        while(i < nums.length && nums[i] == nums[i-1]) i++;
        if(i == nums.length) return true;
        boolean inc = false;
        if(nums[i] > nums[i-1]) inc = true;
        if(inc){
            for(i = 1; i < nums.length; i++){
                if(nums[i] < nums[i-1]) return false;
            }
            return true;
        } else {
            for(i = 1; i < nums.length; i++){
                if(nums[i] > nums[i-1]) return false;
            }
            return true;
        }
    }
}