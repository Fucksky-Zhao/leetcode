class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        double res = x;
        while (true) {
            double pre = res;
            if (res * res != x) res = (res + x / res) / 2;
            if (Math.abs(pre - res) < 0.1) break;
        }
        return (int) res;
    }
}
