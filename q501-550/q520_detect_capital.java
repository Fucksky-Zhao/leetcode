class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        if (word.length() == 2) {
            if (word.charAt(0) >= 'a' && word.charAt(1) <= 'Z') return false;
            return true;
        }

        if (word.charAt(0) >= 'a') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) <= 'Z') return false;
            }
            return true;
        } else {
            if (word.charAt(1) <= 'Z') {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) >= 'a') return false;
                }
                return true;
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) <= 'Z') return false;
                }
                return true;
            }
        }


    }
}
