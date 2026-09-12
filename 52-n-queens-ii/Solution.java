class Solution {
    int c =0;
    public void f(char[][] b, int row, int n){
        if(row == n){
            c++;
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(b, n, row, j)){
                b[row][j] = 'Q';
                f(b, row+1, n);
                b[row][j] = '.';
            }
        }
    }
    public boolean isSafe(char[][] b, int n, int row, int col){
        for(int i=row-1; i>=0; i--){
            if(b[i][col] == 'Q') return false;
        }
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(b[i][j] == 'Q') return false;
        }
        for(int i=row, j=col; i>=0 && j<n; i--, j++){
            if(b[i][j] == 'Q') return false;
        }
        return true;
    }
    public int totalNQueens(int n) {
        if(n == 1) return 1;
        if(n == 2 || n == 3) return c;
        char[][] b = new char[n][n];
        f(b, 0, n);
        return c;
    }
}