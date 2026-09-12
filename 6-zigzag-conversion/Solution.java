class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] row = new StringBuilder[numRows];
        int i=0;
        int sidx=0;
        for(int k=0; k<numRows; k++){
            row[k] = new StringBuilder();
        }
        while(sidx != s.length()){
            while(i<numRows && sidx<s.length()){
                row[i].append(s.charAt(sidx));
                i++;
                sidx++;
            }
            i = numRows-2;
            while(i > 0 && sidx<s.length()){
                row[i].append(s.charAt(sidx));
                sidx++;
                i--;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int k=0; k<numRows; k++){
            res.append(row[k]);
        }
        return res.toString();
    }
}