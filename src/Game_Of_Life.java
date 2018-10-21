class Solution {
    
    public boolean isSafe(int i, int j, int r, int c) {
        return i >= 0 && i < r && j >= 0 && j < c;
    }

    public void gameOfLife(int[][] board) {
       if (board.length == 0) return;

       int r = board.length, c = board[0].length;
       int [][]div = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
       for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
             int s = 0, curr = board[i][j]&1;
             
             for (int k = 0; k < div.length; k++) {
                if (isSafe(i + div[k][0], j + div[k][1], r, c)) {
                   s += (board[i + div[k][0]][j + div[k][1]] & 1);
                }
             }
             if (curr == 1 && (s == 2 || s == 3)) board[i][j] |= 2;
             else if (curr == 0 && s == 3) board[i][j] |= 2;
          }
       }

       for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
             board[i][j] >>= 1;
          }
       }
    }
}
