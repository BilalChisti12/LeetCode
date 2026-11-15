class Solution {
    public String convertDateToBinary(String date) {
        String[] p = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<p.length; i++){
            int n = Integer.parseInt(p[i]);
            sb.append(Integer.toBinaryString(n));
            if(i!=p.length-1){
                sb.append('-');
            }
        }
        return sb.toString();
    }
}