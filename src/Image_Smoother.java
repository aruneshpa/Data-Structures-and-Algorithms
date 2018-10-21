class Solution {

   public boolean isSafe(int i, int j, int r, int c) {
      return i >= 0 && i < r && j >= 0 && j < c;
   }
   
    public int[][] imageSmoother(int[][] M) {
       if (M.length == 0) return M;
       int r = M.length, c = M[0].length;
       int [][] N = new int[r][c];

       for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
             int []row = {-1, -1, -1, 0, 0, 1, 1, 1};
             int []col = {-1, 0, 1, -1, 1, -1, 0, 1};
             int avg = M[i][j], count = 1;
             for (int k = 0; k < 8; k++) {
                if (isSafe(i + row[k], j + col[k]), r, c)) {
                   avg += M[i + row[k]][j + col[k]];
                   count++;
                }
             }
          N[i][j] = avg/count;
          }
       }

       return N;
    }
}
