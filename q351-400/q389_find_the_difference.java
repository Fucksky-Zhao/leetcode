class Solution {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            a[pos]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int pos = t.charAt(i) - 'a';
            a[pos]--;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] < 0) {
                char res = (char) ('a'+i);
                return res;
            }
        }
        return ' ';
    }
}
