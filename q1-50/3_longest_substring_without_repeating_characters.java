class Solution {
    /*original edition, too verbose!
    */
    // public int lengthOfLongestSubstring(String s) {
    //     int maxLength = 0;
    //     int j = 0;
    //     Map<Character, Integer> map = new HashMap<>();
    //     while (j < s.length()) {
    //         if ( map.containsKey(s.charAt(j)) ) {
    //             j = map.get(s.charAt(j)) + 1;
    //             maxLength = (map.size() > maxLength) ? map.size() : maxLength;
    //             map.clear();
    //             continue;
    //         }
    //         map.put(s.charAt(j), j);
    //         j++;
    //         if (j == s.length()) {
    //             maxLength = (map.size() > maxLength) ? map.size() : maxLength;
    //         }
    //     }
    //     return maxLength;
    // }

    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if ( !set.contains(s.charAt(j)) ) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLength;
    }
}
