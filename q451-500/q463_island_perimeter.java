class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int count = 0;
                    if (i >= 1 && grid[i-1][j] == 1) count++;
                    if (i < m - 1 && grid[i+1][j] == 1) count++;
                    if (j >= 1 && grid[i][j-1] == 1) count++;
                    if (j < n - 1 && grid[i][j+1] == 1) count++;
                    res += 4 - count;
                }
            }
        }
        return res;
    }
}
