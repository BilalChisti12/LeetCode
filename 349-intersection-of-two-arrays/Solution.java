class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.putIfAbsent(num, 1);
        }
        for(int num : nums2){
            map.replace(num, 2);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }
        int[] commonElements = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            commonElements[i] = list.get(i);
        }
        return commonElements;
    }
}