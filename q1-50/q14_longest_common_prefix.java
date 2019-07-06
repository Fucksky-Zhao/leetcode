class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        return helper(strs, 0, n-1);
    }

    private String helper(String[] strs, int l, int r) {
        if (l == r) return strs[l];
        else {
            String a = helper(strs, l, (l + r)/2);
            String b = helper(strs, (l+r)/2 +1, r);
            String res = "";
            for (int i = 0; i < a.length(); i++) {
                if (b.length() > i && a.charAt(i) == b.charAt(i)) res += a.charAt(i);
                else break;
            }
            return res;
        }
    }

}
