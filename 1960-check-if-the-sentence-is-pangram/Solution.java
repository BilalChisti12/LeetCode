import java.util.ArrayList;
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean alpha[] = new boolean[26];
        for(char c : sentence.toCharArray()){
            alpha[c - 'a'] = true;
        }
        for(boolean b : alpha){
            if(!b){
                return false;
            }
        }
        return true;
    }
}