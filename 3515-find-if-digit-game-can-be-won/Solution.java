class Solution {
    public boolean canAliceWin(int[] nums) {
        int singsum=0, doubsum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]/10 == 0){
                singsum+=nums[i];
            }
            else{
                doubsum+=nums[i];
            }
        }
        if(singsum > doubsum || doubsum > singsum){
            return true;
        }
        return false;
    }
}