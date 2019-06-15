class Solution {
    public int arrangeCoins(int n) {
        if (n <= 0) return 0;
        int k = 1;
        while (n >= 0) {
            n -= k;
            k++;
        }
        return k - 2;
    }
}
