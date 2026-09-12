class Solution {
    public void f(int i, int[] arr, int target, List<Integer> temp, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i>=arr.length || target < 0) return;
        if(arr[i] > target) return;
        temp.add(arr[i]);
        f(i+1, arr, target-arr[i], temp, res);
        temp.removeLast();
        int next = i+1;
        while(next<arr.length && arr[next] == arr[i]) next++;
        f(next, arr, target, temp, res);

    }
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        f(0, arr, t, new ArrayList<>(), res);
        return res;
    }
}