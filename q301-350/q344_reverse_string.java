class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) return;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
