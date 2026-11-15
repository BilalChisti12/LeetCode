class Solution {
    public int minimumSum(int num) {
        int[] temp = new int[4];
        int idx=0;
        while(num!=0){
            temp[idx++] = num%10;
            num/=10;
        }
        Arrays.sort(temp);
        return ((temp[0]*10)+temp[3]) + ((temp[1]*10)+temp[2]);
    }
}