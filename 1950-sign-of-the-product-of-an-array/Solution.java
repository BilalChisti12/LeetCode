class Solution {
    public int arraySign(int[] nums) {
        int negs=0;
        for(int n : nums){
            if(n ==0){
                return 0;
            }
            if(n < 0){
                negs++;
            }
        }
        if(negs % 2 == 0){
            return 1;
        }
        return -1;
    }
}