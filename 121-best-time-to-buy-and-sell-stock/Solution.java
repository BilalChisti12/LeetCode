class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxPro = Integer.MIN_VALUE;
        while(right < prices.length && left < prices.length){
            if(prices[right] <= prices[left]){
                left = right;
                right++;
            }
            else{
                maxPro = Math.max(maxPro, prices[right]-prices[left]);
                right++;
            }
        }
        return maxPro == Integer.MIN_VALUE ? 0 : maxPro;
    }
}