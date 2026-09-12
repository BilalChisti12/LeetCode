class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='1') a.add(i);

        String ans = "";
        int len = Integer.MAX_VALUE;

        for(int i=0;i+k<=a.size();i++){
            String t = s.substring(a.get(i), a.get(i+k-1)+1);
            if(t.length()<len || (t.length()==len && t.compareTo(ans)<0)){
                len=t.length();
                ans=t;
            }
        }
        return ans;
    }
}