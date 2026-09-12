class Solution {
    public int[][] generateMatrix(int n) {
        int startCol = 0, endCol = n-1, startRow = 0, endRow = n-1;
        int num =1;
        int[][] matrix = new int[n][n];
        while(startCol <= endCol && startRow <= endRow){
            //top
            for(int i=startCol; i<=endCol; i++){
                matrix[startRow][i] = num;
                num++;
            }
            //right
            for(int j=startRow+1; j<=endRow; j++){
                matrix[j][endCol] = num;
                num++;
            }
            //bottom
            for(int i=endCol-1; i>=startCol; i--){
                matrix[endRow][i] = num;
                num++;
            }
            //left
            for(int j=endRow-1; j>=startRow+1; j--){
                matrix[j][startCol] = num;
                num++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}