class Solution {
    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        int res = 0;
        for (int k = 2; k < n; k++) {
            if (!flag[k]) {
                res++;
                for (int j = k + k; j < n; j = j + k) {
                    flag[j] = true;
                }
            }
        }
        return res;
    }
}
