class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int area = Integer.MIN_VALUE;
        while(l<=r){
            int len = Math.min(height[l], height[r]);
            int wid = r-l;
            area = Math.max(area, len*wid);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}