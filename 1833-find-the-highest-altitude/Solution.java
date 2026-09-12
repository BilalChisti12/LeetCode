class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int gains = 0;
        for(int i=0; i<gain.length; i++){
            gains = gains+gain[i];
            max=Math.max(max, gains);
        }
        return max<0 ? 0 : max;
    }
}