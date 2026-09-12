class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=1; i<arr.length-1; i++){
            int d = arr[i] - arr[i-1];
            if(d != arr[i+1]-arr[i]) return false;
        }
        return true;
    }
}