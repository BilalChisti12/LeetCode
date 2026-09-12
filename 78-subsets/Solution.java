class Solution {
    public void f(int i, int[] arr, List<Integer> temp, List<List<Integer>> res){
        if(i == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        f(i+1, arr, temp, res);
        temp.removeLast();
        f(i+1, arr, temp, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(0, nums, new ArrayList<>(), res);
        return res;
    }
}