class Solution {
    public boolean yes(int n){
        int temp = n;
        while(n!=0){
            if(n%10 == 0) return false;
            if(temp%(n%10) != 0) return false;
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(yes(i)){
                res.add(i);
            }
        }
        return res;
    }
}