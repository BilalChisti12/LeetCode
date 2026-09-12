class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] temp = Arrays.copyOf(strs, strs.length);
        for(int i=0; i<strs.length; i++){
            char[] x = temp[i].toCharArray();
            Arrays.sort(x);
            temp[i] = new String(x);
        }
        List<List<String>> res = new ArrayList<>();
        boolean[] flag = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            List<String> st = new ArrayList<>();
            if(!flag[i]){
                st.add(strs[i]);
                for(int j=i+1; j<strs.length; j++){
                    if(temp[i].equals(temp[j])){
                        flag[j] = true;
                        st.add(strs[j]);
                    }
                }
            }
            if(st.size()>0) res.add(st);
        }
        return res;
    }
}