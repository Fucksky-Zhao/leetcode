class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        if ((num & (num - 1)) != 0) return false;
        int ans = 0;
        while (num > 0) {
            ans += num & 1;
            num = num >> 2;
            if (ans > 1) return false;
        }
        return ans == 1;
    }
}
