class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        while (s.length() < 32) {
            s = "0" + s;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return (int) Long.parseLong(sb.toString(), 2);
    }
}