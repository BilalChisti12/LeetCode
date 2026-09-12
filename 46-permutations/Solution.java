class Solution {
    public void f(int idx, int[] arr, List<List<Integer>> res){
        if(idx == arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                temp.add(arr[i]);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            int x = arr[i];
            arr[i] = arr[idx];
            arr[idx] = x;
            f(idx+1, arr, res);
            x = arr[i];
            arr[i] = arr[idx];
            arr[idx] = x;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(0, nums, res);
        return res;
    }
}