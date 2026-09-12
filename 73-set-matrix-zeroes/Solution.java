class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        for(int i=0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                int j=1;
                while(j<matrix.length){
                    matrix[j][i] = 0;
                    j++;
                }
            }
            
        }
        for(int i=1; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                int j=1;
                while(j<matrix[i].length){
                    matrix[i][j] = 0;
                    j++;
                }
            }
        }
        if(firstRowZero){
            int i=0;
            while(i<matrix[0].length){
                matrix[0][i] = 0;
                i++;
            }
        }
        if(firstColZero){
            int i=0;
            while(i<matrix.length){
                matrix[i][0] = 0;
                i++;
            }
        }
    }
}