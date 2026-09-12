class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odds=0;
        int x;
        int prex=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 != 0){
                odds++;
                prex++;
            }
            else{
                odds=0;
                prex=0;
            }
            if(odds==3 && prex==3){
                return true;
            }
        }
        return false;
    }
}