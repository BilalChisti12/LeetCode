class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        boolean[] map = new boolean[words.length];
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            int idx =0;
            while(idx<temp.length()){
                if(first.indexOf(Character.toLowerCase(temp.charAt(idx))) == -1){
                    break;
                }
                else{
                    idx++;
                }
            }
            if(idx == temp.length()){
                map[i] = true;
                continue;
            }
            idx = 0;
            while(idx<temp.length()){
                if(second.indexOf(Character.toLowerCase(temp.charAt(idx))) == -1){
                    break;
                }
                else{
                    idx++;
                }
            }
            if(idx == temp.length()){
                map[i] = true;
                continue;
            }
            idx=0;
            while(idx<temp.length()){
                if(third.indexOf(Character.toLowerCase(temp.charAt(idx))) == -1){
                    break;
                }
                else idx++;
            }
            if(idx == temp.length()){
                map[i] = true;
                continue;
            }
        }
        List<String> reslist = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(map[i]){
                reslist.add(words[i]);
            }
        }
        return reslist.toArray(new String[0]);
    }
}