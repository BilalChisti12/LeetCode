class Solution {
     
    public void rotate(int[] nums, int k) {
        int l =0;
        int r = nums.length-1;
        k%=(r+1);
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        r = k-1;
        l=0;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        l = k;
        r = nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}