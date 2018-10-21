class Solution {
   HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

   public boolean hasCycle(int i, boolean []rec, boolean []visited) {
      if (visited[i]) {
         return true;
      }
      rec[i] = true;
      ArrayList<Integer> neigh = graph.get(i);
      if (neigh != null) {
         for (int n: neigh) {
            if (!visited[n] && rec[n]) {
               return true;
            } else if (!visited[n] && hasCycle(n, rec, visited)) {
               return true;
            }
         }
      }

      visited[i] = true;
      rec[i] = false;
      return false;
   }
   
   public boolean canFinish(int numCourses, int[][] prerequisites) {
      for (int []p: prerequisites) {
         ArrayList<Integer> nodes = graph.getOrDefault(p[1], new ArrayList<>());
         nodes.add(p[0]);
         graph.put(p[1], nodes);
      }

      boolean []visited = new boolean[numCourses];
      
      for (int i = 0; i < numCourses; i++) {
         if (!visited[i]) {
            if (hasCycle(i, new boolean[numCourses], visited)) {
               return false;
            }
         }
      }

      return true;
   }
}
