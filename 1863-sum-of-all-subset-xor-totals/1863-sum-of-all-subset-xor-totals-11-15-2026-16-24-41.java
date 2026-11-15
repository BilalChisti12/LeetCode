class Solution {
    public void f(int i, List<Integer> temp, int[] nums, int[] sum){
        if(i == nums.length){
            int xor=0;
            for(int n:temp){
                xor^=n;
            }
            sum[0]+=xor;
            return;
        }
        temp.add(nums[i]);
        f(i+1, temp, nums, sum);
        temp.removeLast();
        f(i+1, temp, nums, sum);
    }
    public int subsetXORSum(int[] nums) {
        int[] sum= {0};
        f(0, new ArrayList<>(), nums, sum);
        return sum[0];
    }
}