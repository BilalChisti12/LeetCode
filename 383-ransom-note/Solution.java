class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] arr = new int[26];
        int n = magazine.length();
        for(int i=0; i<n; i++){
            arr[magazine.charAt(i)-'a']++;
        }
        n = ransomNote.length();
        for(int i=0; i<n; i++){
            if(arr[ransomNote.charAt(i)-'a']-1 <0){
                return false;
            }
            arr[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}