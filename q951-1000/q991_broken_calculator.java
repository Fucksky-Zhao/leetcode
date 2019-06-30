class Solution {
    public int brokenCalc(int X, int Y) {
        if (X >= Y) return X - Y;
        int res = 0;
        while (X < Y) {
            if ((Y & 1) == 1) {
                Y += 1;
                res++;
            } else {
                Y = Y >> 1;
                res++;
            }
        }
        res += X - Y;
        return res;
    }
}
