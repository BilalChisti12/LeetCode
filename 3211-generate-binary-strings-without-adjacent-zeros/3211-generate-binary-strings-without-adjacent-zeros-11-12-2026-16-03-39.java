class Solution {
    public void f(StringBuilder sb, List<String> res, int n){
        if(sb.length() == n){
            res.add(sb.toString());
            return;
        }
        sb.append('1');
        f(sb, res, n);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length() == 0 || sb.charAt(sb.length()-1) == '1'){
            sb.append('0');
            f(sb, res, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> validStrings(int n) {
       List<String> res = new ArrayList<>();
       f(new StringBuilder(), res, n);
       return res;
    }
}