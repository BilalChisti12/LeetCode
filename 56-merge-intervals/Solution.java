class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] temp = arr[0];
        res.add(temp);
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(temp[1] >= arr[i][0]){
                temp[1] = Math.max(temp[1], arr[i][1]);
            }
            else{
                temp = arr[i];
                res.add(temp);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}