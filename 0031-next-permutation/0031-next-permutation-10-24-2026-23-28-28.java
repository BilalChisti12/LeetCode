class Solution {
    public void nextPermutation(int[] nums) {
        int pIdx=-1;
        int max=nums[0];
        int min=nums[0];
        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                pIdx = i-1;
                break;
            }
        }
        if(pIdx>=0){
           for(int i=nums.length-1; i>pIdx; i--){
                if(nums[i] > nums[pIdx]){
                    int temp = nums[i];
                    nums[i] = nums[pIdx];
                    nums[pIdx] = temp;
                    break;
                }
            }
        }
        int l=pIdx+1;
        int r=nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}