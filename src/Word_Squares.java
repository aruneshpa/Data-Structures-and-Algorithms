class Solution {
   HashMap<String, List<String>> map = new HashMap<>();
   ArrayList<String> square = new ArrayList<String>();;
   List<List<String>> squares = new ArrayList<List<String>>();
   int n;
   
   public List<List<String>> wordSquares(String[] words) {
      if (words.length == 0) return squares;
      n = words[0].length();
      for (String w: words) {
         for (int i = 0; i < n; i++) {
            String key = w.substring(0, i);
            List<String> vals = map.getOrDefault(key, new ArrayList<String>());
            vals.add(w);
            map.put(key, vals);
         }
      }

      build(0);
      return squares;
   }

   public void build(int i) {
      if (i == n) {
         squares.add(new ArrayList<String>(square));
         return;
      }
      
      StringBuilder psb = new StringBuilder();
      for (int k = 0; k < i; k++) {
         psb.append(square.get(k).charAt(i));
      }
      String prefix = psb.toString();
      if (map.containsKey(prefix)) {
         for (String word: map.get(prefix)) {
            if (square.size() == i) square.add(word);
            else square.set(i, word);
            build(i + 1);
         }
      }
   }
}
