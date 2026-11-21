class Solution {
    public String reversePrefix(String word, char ch) {
        int p = -1;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                p = i;
                break;
            }
        }
        if(p == -1) return word;
        StringBuilder sb = new StringBuilder();
        for(int i=p; i>=0; i--){
            sb.append(word.charAt(i));
        }
        for(int i=p+1; i<word.length(); i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}