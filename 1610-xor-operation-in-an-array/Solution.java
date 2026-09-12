class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        int result=0;
        int i=0;
        for(int n1 : arr){
            n1 = start+2*i;
            i++;
            result^= n1;
        }
        return result;

    }
}