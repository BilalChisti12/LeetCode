class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1 >= n2){
            for(int i=0; i<n1; i++){
                map.add(nums1[i]);
            }
        }
        else{
            for(int i=0; i<n2; i++){
                map.add(nums2[i]);
            }
        }
        List<Integer> res = new ArrayList<>();
        if(n1>=n2){
            for(int i=0; i<n2; i++){
                if(map.contains(nums2[i])){
                    map.remove(nums2[i]);
                    res.add(nums2[i]);
                }
            }
        }
        else{
            for(int i=0; i<n1; i++){
                if(map.contains(nums1[i])){
                    res.add(nums1[i]);
                    map.remove(nums1[i]);
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}