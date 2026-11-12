class Solution {
    public void f(StringBuilder sb, List<String> res, int n, int last){
        if(sb.length() == n){
            res.add(sb.toString());
            return;
        }
        sb.append('1');
        f(sb, res, n, 1);
        sb.deleteCharAt(sb.length()-1);
        if(last == -1 || last != 0){
            sb.append('0');
            f(sb, res, n, 0);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> validStrings(int n) {
       List<String> res = new ArrayList<>();
       f(new StringBuilder(), res, n, -1);
       return res;
    }
}