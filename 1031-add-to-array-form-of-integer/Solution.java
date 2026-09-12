import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger res= BigInteger.ZERO;
        for(int i=0; i<num.length; i++){
            res = res.multiply(BigInteger.TEN).add(BigInteger.valueOf(num[i]));
        }
        res = res.add(BigInteger.valueOf(k));
        String s = res.toString();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i)-'0');
        }
        return list;
    }
}