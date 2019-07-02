class Solution {
    public int countDigitOne(int n) {
        if (n == 0) return 0;
        double cnt = 0, residual = 0, i = 0;
        while (n > 0) {
            if (n % 10 > 1) {
                cnt += (n / 10 + 1) * Math.pow(10, i);
            } else if (n % 10 == 1) {
                cnt += (n / 10) * Math.pow(10, i) + residual + 1;
            } else {
                cnt += (n / 10) * Math.pow(10, i);
            }
            residual += (n % 10) * Math.pow(10, i);
            n = n / 10;
            i++;
        }
        return (int) cnt;
    }
}
