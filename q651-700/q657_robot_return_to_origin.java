class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, c = 0;
        if (moves == null || moves.length() == 0) return true;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') c++;
            else if (moves.charAt(i) == 'L') c--;
            else if (moves.charAt(i) == 'U') r--;
            else if (moves.charAt(i) == 'D') r++;
        }
        return r == 0 && c == 0;
    }
}
