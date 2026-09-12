class Solution {
    public int minDays(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, 999999);
        dp[0] = -1;
        for(int i=1; i<=n; i++){
            for(int k=1; k*(k+1)/2 <= i; k++){
                dp[i] = Math.min(dp[i], dp[i-k*(k+1)/2]+k+1);
            }
        }
        return dp[n];
    }
}