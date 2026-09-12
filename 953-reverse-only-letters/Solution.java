class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        StringBuilder sb = new StringBuilder(s);
        int r=s.length()-1;
        while(l<r){
            if(Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r))){
                char temp = s.charAt(l);
                sb.setCharAt(l, s.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
            if(!Character.isLetter(s.charAt(l))) l++;
            if(!Character.isLetter(s.charAt(r))) r--;
        }
        return sb.toString();
    }
}