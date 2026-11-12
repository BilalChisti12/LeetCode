class Solution {
    public void f(StringBuilder sb, List<String> res, int n){
        if(sb.length() == n){
            if(sb.indexOf("00") == -1){
                res.add(sb.toString());   
            }
            return;
        }
        sb.append('0');
        f(sb, res, n);
        sb.deleteCharAt(sb.length()-1);
        sb.append('1');
        f(sb, res, n);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
       List<String> res = new ArrayList<>();
       f(new StringBuilder(), res, n);
       return res;
    }
}