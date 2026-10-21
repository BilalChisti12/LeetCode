class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        boolean[] flag = new boolean[128];
        int c=0;
        for(int i=0; i<128; i++){
            if(freq[i]!=0) c++;
        }
        while(c!=0){
            int max = 0;
            for(int i=0; i<128; i++){
                if(!flag[i]){
                    max = Math.max(max, freq[i]);
                }
            }
            for(int i=0; i<128; i++){
                if(freq[i] == max && !flag[i]){
                    flag[i] = true;
                    break;
                }
            }
            for(int i=0; i<128; i++){
                if(freq[i] == max && flag[i]){
                    while(freq[i] !=0){
                        sb.append((char)i);
                        freq[i]--;
                    }
                }
            }
            c--;
        }
        return sb.toString();
    }
}