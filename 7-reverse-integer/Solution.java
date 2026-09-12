class Solution {
    public int reverse(int x) {
        int temp = x;
        long rev = 0;
        while(temp!=0){
            rev = rev*10+ temp%10;
            if(rev < Integer.MIN_VALUE) return 0;
            if(rev > Integer.MAX_VALUE) return 0;
            temp/=10;
        }
        return (int)rev;
    }
}