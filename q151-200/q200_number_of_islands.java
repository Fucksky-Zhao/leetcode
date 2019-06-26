class Solution {
    boolean[][] visited;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;

        visited = new boolean[m][n];
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    res++;

                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '0') return;
        visited[i][j] = true;

        int m = grid.length;
        int n = grid[0].length;
        if (i >= 1 && visited[i-1][j] == false) dfs(grid, i-1, j);
        if (i < m-1 && visited[i+1][j] == false) dfs(grid, i+1, j);
        if (j >= 1 && visited[i][j-1] == false) dfs(grid, i, j-1);
        if (j < n-1 && visited[i][j+1] == false) dfs(grid, i, j+1);
    }
}
