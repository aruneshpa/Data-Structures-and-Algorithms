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

   /*
    * Using Union Find algorithm.
    */
   
   public int find(int x, int []parent) {
      if (parent[x] == x) return x;
      return parent[x] = find(parent[x]);
   }
   
   public boolean union(int s, int d, int []parent, int []rank) {
      int xr = find(s, parent);
      int yr = find(d, parent);
      if (xr == yr) return false;

      if (rank[xr] < rank[yr]) {
         parent[xr] = yr;
      } else if (rank[xr] > rank[yr]) {
         parent[yr] = xr;
      } else {
         rank[yr]++;
         parent[xr] = yr;
   }
   
      public boolean canFinish(int n, int[][] prerequisites) {
      int []parent = new int[n];
      int []rank = new int[n];
      Arrays.fill(rank, 0);
      for (int i = 0; i < n; i++) parent[i] = i;

      for (int []e: prerequisites) {
         int s = e[0], d = e[1];
         if (!union(s, d, parent, rank)) {
            return false;
         }
      }

      return true;
   }

}
