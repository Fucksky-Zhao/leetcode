class Solution {
    public int reverse(int x) {
        int result = 0;
        int remainder, tail;

        while (x != 0) {
            tail = x % 10;
            result = result * 10 + tail;

            if (result % 10 != tail) {
                return 0;
            }//check if there exists overflow.

            x = x / 10;
        }

        return result;
    }
}
