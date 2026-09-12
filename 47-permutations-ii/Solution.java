class Solution {
    public void f(int idx, int[] arr, List<List<Integer>> res){
        if(idx==arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                temp.add(arr[i]);
            }
            if(!res.contains(temp)){
                res.add(temp);
            }
            return;
        }
        for(int i=idx; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            f(idx+1, arr, res);
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        f(0, nums, res);
        return res;
    }
}