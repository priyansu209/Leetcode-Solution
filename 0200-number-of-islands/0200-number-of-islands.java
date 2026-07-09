class Solution {

    int[] directionX = {-1, 1, 0, 0};
    int[] directionY = {0, 0, -1, 1};

    public boolean Valid(int i, int j, int n, int m) {
        return !(i < 0 || i >= n || j < 0 || j >= m);
    }

    public void DFS(char[][] grid, boolean[][] vis, int n, int m, int i, int j) {
        vis[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int row = i + directionX[k];
            int col = j + directionY[k];

            if (Valid(row, col, n, m)
                    && grid[row][col] == '1'
                    && !vis[row][col]) {

                DFS(grid, vis, n, m, row, col);
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    DFS(grid, vis, n, m, i, j);
                    res++;
                }
            }
        }

        return res;
    }
}