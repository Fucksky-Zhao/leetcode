class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int ans = 0;
        while (n > 0) {
            ans += n & 1;
            n = n >> 1;
            if (ans > 1) return false;
        }
        return true;
    }
}
