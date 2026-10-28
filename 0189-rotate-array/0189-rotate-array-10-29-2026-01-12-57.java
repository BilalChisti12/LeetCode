class Solution {
    public void rotate(int[] nums, int k) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        l=0;
        r=(k%nums.length)-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        l=(k%nums.length);
        r=nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}