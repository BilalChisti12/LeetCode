class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<=k){
                temp.add(nums[i]);
            }
        }
        int[] res = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}