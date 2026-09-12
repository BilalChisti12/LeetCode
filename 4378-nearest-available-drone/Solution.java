class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        double res = Double.MAX_VALUE;
        int idx=-1;
        for(int i=0; i<drones.length; i++){
            double dist = Math.abs(target[0] - drones[i][0])+Math.abs(target[1] - drones[i][1]);
            if(dist<= drones[i][2] && dist < res){
                res = dist;
                idx = i;
            }
        }
        return res == Double.MAX_VALUE ? -1 : idx;
    }
}