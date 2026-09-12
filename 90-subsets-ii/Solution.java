class Solution {
    public void f(int i, int[] arr, List<Integer> temp, List<List<Integer>> res){
        if(i>=arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        f(i+1, arr, temp, res);
        temp.removeLast();
        int next = i+1;
        while(next<arr.length && arr[next] == arr[i]) next++;
        f(next, arr, temp, res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        f(0, nums, new ArrayList<>(), res);
        return res;
    }
}