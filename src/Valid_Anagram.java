public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char ch[] = new char[26];
        for(int i=0; i<s.length(); i++) {
            ch[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            if (ch[t.charAt(i) - 'a'] <= 0) {
                return false;
            } else {
                ch[t.charAt(i) - 'a']--;
            }
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int []count = new int[26];
        for(char c: s.toCharArray())
            count[c-'a']++;
        for(char c: t.toCharArray()) {
            if (--count[c - 'a'] < 0)
                return false;
        }
        return true;
    }
}
