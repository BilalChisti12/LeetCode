class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!pos.containsKey(nums[i])){
                pos.put(nums[i], new ArrayList<>());
            }
            pos.get(nums[i]).add(i);
        }
        int c=0;
        for(List<Integer> i : pos.values()){
            if(i.size() == 3 && i.get(1)-i.get(0) == i.get(2) - i.get(1)){
                c++;
            }
        }
        return c;
    }
}