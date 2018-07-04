public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> h = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if (h.contains(s.charAt(i))) {
                count++;
                h.remove(s.charAt(i));
            } else {
                h.add(s.charAt(i));
            }
        }
        if (!h.isEmpty()) {
            return 2 * count + 1;
        } else {
            return 2 * count;
        }
    }
}
