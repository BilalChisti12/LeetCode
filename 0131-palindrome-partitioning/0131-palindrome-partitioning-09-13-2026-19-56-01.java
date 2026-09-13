class Solution {
    public void f(int i, String s, List<List<String>> res, List<String> temp){
        if(i == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i; j<s.length(); j++){
            if(isPal(s, i, j)){
                temp.add(s.substring(i, j+1));
                f(j+1, s, res, temp);
                temp.removeLast();
            }
        }
    }
    public boolean isPal(String s, int l, int r){
        if(s.length() == 1) return true;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        f(0, s, res, new ArrayList<>());
        return res;
    }
}