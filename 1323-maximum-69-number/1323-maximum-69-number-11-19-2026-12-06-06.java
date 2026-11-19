class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0; i<s.length(); i++){
            if(!flag){
                if(s.charAt(i) == '6'){
                    sb.append('9');
                    flag = true;
                    continue;
                }
            }
            sb.append(s.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }
}