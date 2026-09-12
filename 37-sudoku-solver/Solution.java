class Solution {
    public boolean f(char[][] b, int row, int col){
        if(row == b.length) return true;
        if(col == b[0].length) return f(b, row+1, 0);
        if(b[row][col] != '.'){
            return f(b, row, col+1);
        }
        for(int i=1; i<=9; i++){
            if(isSafe(b, (char)(i+'0'), row, col)){
                b[row][col] = (char)(i+'0');
                if(f(b, row, col)) return true;
                b[row][col] = '.';
            }
        }
        return false;
    }
    public boolean isSafe(char[][] b, char x, int row, int col){
        for(int i=0; i<b.length; i++){
            if(b[row][i] == x) return false;
            if(b[i][col] == x) return false;
        }
        int grow = row - row%3;
        int gcol = col - col%3;
        for(int i=grow; i<grow+3; i++){
            for(int j=gcol; j<gcol+3; j++){
                if(b[i][j] == x) return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        f(board, 0, 0);
    }
}