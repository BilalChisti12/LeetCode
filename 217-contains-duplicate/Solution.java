class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1 || (nums.length == 2 && nums[0] != nums[1])){
            return false;
        }
        HashSet<Integer> map = new HashSet<>();
        for(int n: nums){
            if(map.contains(n)) return true;
            map.add(n);
        }
        return false;
    }
}