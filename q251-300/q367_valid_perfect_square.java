class Solution {
    public boolean isPerfectSquare(int num) {
        double a = 1;
        while (true) {
            double pre = a;
            a = (a + num/a) / 2;
            if (Math.abs(pre - a) < 0.001) break;
        }
        int ans = (int) Math.round(a);
        return ans * ans == num;
    }
}
