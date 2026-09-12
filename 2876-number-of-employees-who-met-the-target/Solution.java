class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int emps =0;
        for(int n : hours){
            if(n >= target){
                emps++;
            }
        }
        return emps;
    }
}