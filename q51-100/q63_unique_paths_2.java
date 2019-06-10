class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m = obstacleGrid.length;
//         int n = obstacleGrid[0].length;
//         int [][] dp = new int [m][n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 dp[i][j] = 1;
//                 if (obstacleGrid[i][j] == 1) {
//                     dp[i][j] = 0;
//                 }
//             }
//         }

//         for (int i = 1; i < m; i++) {
//             if (dp[i][0] != 0) dp[i][0] = dp[i-1][0];
//         }
//         for (int j = 1; j < n; j++) {
//             if (dp[0][j] != 0) dp[0][j] = dp[0][j-1];
//         }


//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (dp[i][j] != 0) {
//                     dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                 }
//             }
//         }

//         return dp[m-1][n-1];
//     }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }
}
