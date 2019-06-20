class Solution {
    Map<Integer, int[]> map;

    private void createMap() {
        map = new HashMap<>();

        map.put(1, new int[]{-2, 1});
        map.put(2, new int[]{-1, 2});
        map.put(3, new int[]{1, 2});
        map.put(4, new int[]{2, 1});

        map.put(5, new int[]{2, -1});
        map.put(6, new int[]{1, -2});
        map.put(7, new int[]{-1, -2});
        map.put(8, new int[]{-2, -1});
    }

    private boolean isValid(int N, int r, int c) {
        if ( r < 0 || r >= N || c < 0 || c >= N) return false;
        return true;
    }

    public double knightProbability(int N, int K, int r, int c) {
        if ( !isValid(N, r, c) ) return 0.0;
        double[][] dp = new double[N][N];
        createMap();
        for (double[] a : dp) Arrays.fill(a, 1.0);
        for (int k = 1; k <= K; k++) {
            double[][] dp1 = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
	                    int[] a = entry.getValue();
                        if (isValid(N, i+a[0], j+a[1])){
                            dp1[i][j] +=  dp[i + a[0] ][j + a[1] ];
                        }
                    }
                }
            }
            dp = dp1;
        }
        return dp[r][c] / Math.pow(8.0, K);
    }
}
