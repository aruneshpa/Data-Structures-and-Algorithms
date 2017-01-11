public class Solution {
    public char findTheDifference(String ss, String tt) {
        char h2[] = new char[26];
        for(int i=0; i<ss.length(); i++) {
            h2[ss.charAt(i) - 'a']++;
        }
        for(int i=0; i<tt.length(); i++) {
            if (h2[tt.charAt(i) - 'a'] == 0) {
                return tt.charAt(i);
            } else
                h2[tt.charAt(i) - 'a']--;
        }
        return tt.charAt(0);
    }
}
