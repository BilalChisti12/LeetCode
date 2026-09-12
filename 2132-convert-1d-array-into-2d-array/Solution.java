class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return new int[0][0];
        int[][] res = new int[m][n];
        int x = original.length;
        int i = 0;
        int ridx = 0;
        int cidx = 0;
        while(i < x){
            if(cidx == n){
                ridx++;
                cidx=0;
            }
            res[ridx][cidx++] = original[i];
            i++;
        }
        return res;
    }
}