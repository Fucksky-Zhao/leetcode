class Solution {
    public boolean checkRecord(String s) {
        int cnt1 = 0;
        boolean flag1 = false, flag2 = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'L') {
                flag1 = false;
                flag2 = false;
            }
            if (s.charAt(i) == 'A') {
                cnt1++;
            }

            if (s.charAt(i) == 'L' && flag2) return false;
            if (s.charAt(i) == 'L' && flag1) flag2 = true;
            if (s.charAt(i) == 'L' && !flag1) flag1 = true;
            if (cnt1 > 1) return false;
        }
        return true;
    }
}
