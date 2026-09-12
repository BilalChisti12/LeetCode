class Solution {
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int idx=cost.length-1;
       int res =0;
       if(idx == 0){
        return cost[idx];
       }
       if(idx == 1){
        return cost[0]+cost[1];
       }
       while(idx>=0){
        res+=cost[idx--];
        if(idx >-1){
            res+=cost[idx--];
        }
        idx--;
       }
       return res;
    }
}