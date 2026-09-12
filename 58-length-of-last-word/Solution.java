class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i = s.length()-1;
        if(i == 0 && s.charAt(i) != ' '){
            return 1;
        }
        if(s.charAt(i) == ' '){
            while(s.charAt(i) == ' '){
                i--;
            }
        }
        while(s.charAt(i) != ' ' ){
            count++;
            if(i==0){
                return count;
            }
            i--;
        }
        return count;
    }
}