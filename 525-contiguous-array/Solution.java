class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum=0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i] == 0 ? -1 : nums[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            else{
                int r = i - map.get(sum);
                maxLen = Math.max(maxLen, r);
            }
        }
        return maxLen;
    }
}