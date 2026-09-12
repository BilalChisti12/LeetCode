class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int n = nums.length;
        int l = 0;
        int r = k-1;
        double avg = 0;
        int sum = 0;
        for(int i = l; i<=r; i++){
            sum = sum+nums[i];
        }
        avg = (double)sum/(double)k;
        maxAvg = Math.max(maxAvg, avg);
        l++;
        r++;
        while(r<n){
            sum += nums[r];
            sum -= nums[l-1]; 
            avg = (double)sum/(double)k;
            maxAvg = Math.max(maxAvg, avg);
            l++;
            r++;
        }
    return maxAvg;
    }
}