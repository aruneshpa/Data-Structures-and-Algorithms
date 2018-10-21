class Solution {

   public boolean remove(String s, String t) {
      if (s.length() - 1 != t.length()) return false;
      
      for (int i = 0; i < s.length(); i++) {
         String left = s.substring(0, i);
         String right = s.substring(i + 1, s.length());
         StringBuilder sb = new StringBuilder();
         sb.append(left).append(right);
         if (sb.toString().equals(t)) return true;
      }
      return false;
   }

   public boolean replace(String s, String t) {
      if (s.length() != t.length()) return false;

      for (int i = 0; i < s.length(); i++) {
         String sl = s.substring(0, i);
         String sr = s.substring(i + 1, s.length());
         String tl = t.substring(0, i);
         String tr = t.substring(i + 1, t.length());
         StringBuilder sbs= new StringBuilder();
         sbs.append(sl).append(sr);

         StringBuilder sbt = new StringBuilder();
         sbt.append(tl).append(tr);

         if (sbs.toString().equals(sbt.toString())) return true;
      }
      return false;
   }
   
   
   public boolean isOneEditDistance(String s, String t) {
      if (s.equals(t)) return false;
      return remove(s, t) || remove(t, s) || replace(s, t);
   }
}
