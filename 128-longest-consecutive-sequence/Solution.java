class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> map = new HashSet<>();
        for(int num : nums){
            map.add(num);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int n: map){
            if(!map.contains(n-1)) temp.add(n);
        }
        int finalCount = Integer.MIN_VALUE;
        for(int i=0; i<temp.size(); i++){
            int count = 1;
            int x = temp.get(i);
            while(map.contains(x+1)){
                count++;
                x++;
            }
            finalCount = Math.max(finalCount, count);
        }
        return finalCount;
    }
}