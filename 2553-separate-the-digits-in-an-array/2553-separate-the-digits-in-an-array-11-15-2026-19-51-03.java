class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        int idx=0;
        for(int i=0; i<nums.length; i++){
            int dig = (int)Math.log10(nums[i])+1;
            if(dig == 1) temp.add(idx++, nums[i]);
            else{
                int a = dig;
                while(nums[i] !=0){
                    temp.add(idx, nums[i]%10);
                    nums[i]/=10;
                    dig--;
                }
                idx+=a;
            }
        }
        int[] res = new int[temp.size()];
        for(int i=0; i<res.length; i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}