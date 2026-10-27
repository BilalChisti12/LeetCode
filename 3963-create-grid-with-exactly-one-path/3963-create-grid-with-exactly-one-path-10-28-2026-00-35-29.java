class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        int idx=0;
        int a=m;
        int b=n;
        while(a!=0){
            StringBuilder sb1 = new StringBuilder();
            while(b!=0){
                sb1.append('.');
                b--;
            }
            if(b==0){
                res[idx++] = sb1.toString();
                b=n;
                a--;
                if(a==0) break;
            }
            int x= n;
            StringBuilder sb2 = new StringBuilder();
            while(x!=1){
                sb2.append('#');
                x--;
            }
            sb2.append('.');
            res[idx++] = sb2.toString();
            a--;
        }
        return res;
    }
}