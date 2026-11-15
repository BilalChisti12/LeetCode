class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];
        int idx=0;
        for(int i=0; i<matrix.length; i++){
            int sum=0;
            for(int j=0; j<matrix.length; j++){
                sum+=matrix[i][j];
            }
            res[idx++] = sum;
        }
        return res;
    }
}