class Solution {
    Map<Character, char[]> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        buildMap();
        List<String> res = new ArrayList<>();
        String item = "";
        if (digits == null || digits.length() < 1) return res;
        helper(digits, 0, res, item);
        return res;
    }

    private void helper(String digits, int pos, List res, String item) {
        for (char s : map.get(digits.charAt(pos))) {
            String item_new = item + s;
            if (pos == digits.length() - 1) res.add(item_new);
            else helper(digits, pos+1, res, item_new);
        }
    }

    private void buildMap() {
        map.put('0', new char[]{' '});
        map.put('1', null);
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});

        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});

        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }
}
