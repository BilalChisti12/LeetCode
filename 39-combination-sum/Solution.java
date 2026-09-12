    class Solution {
        public void f(int i, int[] arr, int target, List<Integer> temp, List<List<Integer>> res){
            if(i>=arr.length || target<0){
                return;
            }
            if(target == 0){
                res.add(new ArrayList<>(temp));
                return;
            }
            temp.add(arr[i]);
            f(i, arr, target-arr[i], temp, res);
            temp.removeLast();
            f(i+1, arr, target, temp, res);

        }
        public List<List<Integer>> combinationSum(int[] arr, int target) {
            List<List<Integer>> res = new ArrayList<>();
            f(0, arr, target, new ArrayList<>(), res);
            return res;
        }
    }