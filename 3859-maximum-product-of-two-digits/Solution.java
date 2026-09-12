class Solution {
    public int maxProduct(int n) {
        String s= String.valueOf(n);
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        int idx=0;
        int zeroC=0;
        for(int i=0; i<s.length(); i++){
            int temp = max1;
            if(s.charAt(i)-'0' == 0) zeroC++;
            max1 = Math.max(max1, s.charAt(i)-'0');
            if(temp!= max1) idx = i;
        }
        if(zeroC == (int)Math.log10(n)+1) return 0;
        for(int i=0; i<s.length(); i++){
            if(i == idx) continue;
            max2 = Math.max(max2, s.charAt(i)-'0');
        }
        return max1*max2;
    }
}