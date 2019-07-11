class Solution {
    public int firstUniqChar(String s) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            if (a[pos] == 0) a[pos] = 1;
            else if (a[pos] == 1) a[pos] = 2;
        }
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            if (a[pos] == 1) return i;
        }
        return -1;
    }
}
