class Solution {
    public int countDigits(int num) {
        int num1=num;
        int yes =0;
        while(num1>0){
            if(num % (num1%10)==0){
                yes++;
            }
            num1/=10;
        }
        return yes;
    }
}