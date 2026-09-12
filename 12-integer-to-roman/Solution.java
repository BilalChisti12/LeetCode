class Solution {
    public String intToRoman(int num) {
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int i=0;
            while(i<vals.length){
                int val= num/vals[i];
                if(val > 0){
                    sb.append(romans[i].repeat(val));
                    num = num%vals[i];
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }
}