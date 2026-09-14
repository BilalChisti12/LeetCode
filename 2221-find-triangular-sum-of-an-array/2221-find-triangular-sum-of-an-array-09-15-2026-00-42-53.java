class Solution {
    public int triangularSum(int[] arr) {
        if(arr.length <=1) return arr[0];
        int n=arr.length;
        while(n!=0){
            for(int i=1; i<n; i++){
                arr[i-1]= (arr[i-1]+arr[i])%10;
            }
            n--;
        }
        return arr[0];
    }
}