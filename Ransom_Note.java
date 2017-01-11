public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char mag[] = new char[26];
        for(int i=0; i<magazine.length(); i++) {
            mag[magazine.charAt(i) - 'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++) {
            if (mag[ransomNote.charAt(i) - 'a'] >0) {
                mag[ransomNote.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
