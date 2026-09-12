class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int startRow=0, startCol=0, endRow = matrix.length-1, endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                res.add(matrix[startRow][i]);
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                res.add(matrix[i][endCol]);
            }
            if(startRow < endRow){
                //bottom
                for(int i=endCol-1; i>=startCol; i--){
                    res.add(matrix[endRow][i]);
                }
            }
            if(startCol<endCol){
                //left
                for(int i=endRow-1; i>=startRow+1; i--){
                    res.add(matrix[i][startCol]);
                }                
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return res;
    }
}