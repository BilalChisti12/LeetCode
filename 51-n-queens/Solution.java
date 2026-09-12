class Solution {
    public void f(char[][] b, int row, int n, List<List<String>> res){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(b[i]));
            }
            res.add(temp);
            return;
        }
        for(int i=0; i<n; i++){
            if(safe(b, n, row, i)){
                b[row][i] = 'Q';
                f(b, row+1, n, res);
                b[row][i] = '.';
            }
        }
    }
    public boolean safe(char[][] b, int n, int row, int col){
        for(int i=0; i<n; i++){
            if(b[i][col] == 'Q') return false;
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(b[i][j] == 'Q') return false;
        }
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++){
            if(b[i][j] == 'Q') return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] b = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(b[i], '.');
        }
        f(b, 0, n, res);
        return res;
    }
}