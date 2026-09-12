class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> temp = new ArrayList<>();
        int i=0;
        int n = intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            temp.add(intervals[i++]);
        }
        while(i<n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
        }
        temp.add(newInterval);
        while(i<n){
            temp.add(intervals[i++]);
        }
        return temp.toArray(new int[temp.size()][]);
    }
}