class Solution {
    public int titleToNumber(String s) {
        int n = s.length();
        int res = 0;
        for (int i = n-1; i >= 0; i--) {
            res += ((int) (s.charAt(i) - 'A') + 1) * Math.pow(26,(n - i-1));
        }
        return res;
    }
}
