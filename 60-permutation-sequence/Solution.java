class Solution {
    String ans = "";
    int c =0;
    public boolean f(int n, int k, boolean[] map, StringBuilder sb){
        if(sb.length() == n){
            c++;
            if(c == k){
                ans = sb.toString();
                return true;
            }
            return false;
        }
        for(int i=0; i<n; i++){
            if(!map[i]){
                sb.append(i+1);
                map[i] = true;
                if(f(n, k, map, sb)) return true;
                sb.deleteCharAt(sb.length()-1);
                map[i] = false;
            }
        }
        return false;
    }
    public String getPermutation(int n, int k) {
        List<String> res = new ArrayList<>();
        f(n, k, new boolean[n], new StringBuilder());
        return ans;
    }
}