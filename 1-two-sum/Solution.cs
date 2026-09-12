public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int, int> map = new Dictionary<int, int>();
        int[] res = new int[2];
        for(int i=0; i<nums.Length; i++){
            if(map.ContainsKey(target-nums[i])){
                res[0] = i;
                res[1] = map[target-nums[i]];
                break;
            }
            else{
                map[nums[i]] = i;
            }
        }
        return res;
    }
}