class Solution {
    public String toLowerCase(String str) {
        char[] a = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                a[i] = (char) (str.charAt(i) + 32);
            } else {
                a[i] = str.charAt(i);
            }
        }
        return String.valueOf(a);
    }
}
