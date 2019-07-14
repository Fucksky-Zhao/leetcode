class Solution {
    public int[][] transpose(int[][] A) {
        if (A == null || A.length < 1) return A;
        int m = A.length, n = A[0].length;
        int[][] res = new int[n][m];
        int cnt = 0;
        for (int[] a : A) {
            for (int i = 0; i < n; i++) {
                res[i][cnt] = a[i];
            }
            cnt++;
        }
        return res;
    }
}
