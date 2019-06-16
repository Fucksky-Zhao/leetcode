class Solution {
    public int superEggDrop(int K, int N) {
        if (K == 1 || N == 1) return N;
        int[][] dp = new int[K+1][N+1];
        for (int i = 1; i <= K; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }
        for (int j = 0; j <= N; j++) {
            dp[1][j] = j;
        }
        for (int i = 2; i <= K; i++) {
            for (int j = 2; j <= N; j++) {
                // dp[i][j] = Integer.MAX_VALUE;
                // for (int m = 1; m <= j; m++) {
                //     dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[i][j-m], dp[i-1][m-1]));
                // }
                int low = 1, high = j;
                while (low + 1 < high) {
                    int middle = (low + high) / 2;
                    int f1 = dp[i][j-middle];
                    int f2 = dp[i-1][middle-1];
                    if (f1 > f2) {
                        low = middle;
                    } else if (f1 < f2) {
                        high = middle;
                    } else {
                        low = high = middle;
                    }
                }
                dp[i][j] = 1 + Math.min(Math.max(dp[i][j-low], dp[i-1][low-1]),
                                        Math.max(dp[i][j-low-1], dp[i-1][low]));

            }
        }
        return dp[K][N];
    }
}
