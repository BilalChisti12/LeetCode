class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                char temp = map.get(s.charAt(i));
                if(temp != t.charAt(i)) return false;
                continue;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map2.containsKey(t.charAt(i))){
                char temp = map2.get(t.charAt(i));
                if(temp != s.charAt(i)) return false;
                continue;
            }
            map2.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}