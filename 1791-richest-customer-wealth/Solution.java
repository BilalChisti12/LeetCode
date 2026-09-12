class Solution {
    public int maximumWealth(int[][] accounts) {
        int sums[] = new int[accounts.length];
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                sums[i] += accounts[i][j];
            }
        }
        int max = sums[0];
        for(int i=0; i< sums.length; i++){
            if(sums[i]>max){
                max = sums[i];
            }
        }
        return max;
    }
}