class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> map = new HashSet<>();
        int[] res = new int[friends.length];
        for(int i=0; i<friends.length; i++){
            map.add(friends[i]);
        }
        int idx=0;
        for(int i=0; i<order.length; i++){
            if(map.contains(order[i])) res[idx++] = order[i];
        }
        return res;
    }
}