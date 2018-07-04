public class Solution {
    public int islandPerimeter(int[][] grid) {
        // each internal edge is being skipped twice for removal.
        int island = 0;
        int n= 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i<grid.length -1 && grid[i+1][j] == 1) n++;
                    if (j<grid[0].length -1 && grid[i][j+1] == 1) n++; 
                }
            }
        }
        return island * 4 - n * 2;
    }
}
