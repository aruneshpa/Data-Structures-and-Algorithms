public class Solution {
    public int titleToNumber(String s) {
        int base = 1;
        int num = 0;
        for(int i= s.length() - 1; i>=0; i--) {
            num += (Character.toUpperCase(s.charAt(i)) -'A' + 1) * base;
            base = base * 26;
        }
        return num;
    }
}
