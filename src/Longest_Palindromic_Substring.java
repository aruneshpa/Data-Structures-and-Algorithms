class Solution {
   int st = -1;
   int len = 0;
   
   public String longestPalindrome(String s) {
      if (s.length() == 0) return "";

      for (int i = 0; i < s.length(); i++) {
         expand(s, i, i);
         expand(s, i, i+1);
      }
      return s.substring(st, st + len);
   }

   public void expand(String s, int l, int r) {
      while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
         l--; r++;
      }
      if (r - l - 1 > len) {
         len = r - l - 1;
         st = l + 1;
      }
   }
   
}
