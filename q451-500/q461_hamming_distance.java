class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int ans = x ^ y;
        while (ans > 0) {
            count += ans % 2;
            ans = ans >> 1;
        }
        return count;
    }
}
