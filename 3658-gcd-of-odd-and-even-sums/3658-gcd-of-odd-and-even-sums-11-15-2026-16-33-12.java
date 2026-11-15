class Solution {
    public int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 2;
        int oddSum = 1;
        int a = 2;
        int b = 1;
        for(int i=2; i<=n; i++){
            a += 2;
            evenSum+=a;
            b += 2;
            oddSum+=b;
        }
        return gcd(evenSum, oddSum);
    }
}