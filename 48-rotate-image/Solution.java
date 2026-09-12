class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i< matrix.length; i++){
            for(int j=i+1; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }
        // int temp;
        // int[][] matrix2 = matrix;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j< matrix[i].length; j++){
        //         matrix[i][j] = matrix[i][matrix[i].length-1];
        //     }

        // }
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}