class Solution {
    public void subsets(int i, int k, int[] arr, List<Integer> temp, List<List<Integer>> res){
        if(temp.size() == k || i == arr.length){
            if(temp.size() == k) res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        subsets(i+1, k, arr, temp, res);
        temp.removeLast();
        subsets(i+1,k, arr, temp, res);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        List<List<Integer>> res = new ArrayList<>();
        subsets(0, k, arr, new ArrayList<>(), res);
        return res;
    }
}