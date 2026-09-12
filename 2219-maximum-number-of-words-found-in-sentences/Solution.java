class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String s : sentences){
            String[] words = s.split("\\s+");
            maxWords = Math.max(maxWords, words.length);
        }
        return maxWords;
    }
}