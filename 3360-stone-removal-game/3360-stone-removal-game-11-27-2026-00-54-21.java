class Solution {
    public boolean canAliceWin(int n) {
        int t = 10;
        n = n-t;
        if(n<0) return false;
        if(n == 0) return true;
        boolean win = true;
        while(n>=0){
            t--;
            n-=t;
            if(n<0 && !win) return false;
            if(win) win = false;
            else win = true;
        }
        return !win;
    }
}