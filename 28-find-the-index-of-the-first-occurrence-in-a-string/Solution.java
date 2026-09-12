class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        int index = 0;

        for(int i = 0; i < haylen; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                index = i;
                int j = 1;
                int ival = i;

                while(j < needlen && ival + 1 < haylen){
                    if(needle.charAt(j) != haystack.charAt(ival + 1)){
                        break;
                    } else {
                        j++;
                        ival++;
                    }
                }

                if(j == needlen){
                    return index;
                }
            }
        }
        return -1;
    }
}