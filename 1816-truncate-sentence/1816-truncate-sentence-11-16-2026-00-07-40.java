class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int c=0;
        for(String str : s.split(" ")){
            if(c == k) break;
            sb.append(str);
            if(c<k-1) sb.append(' ');
            c++;
        }
        return sb.toString();
    }
}