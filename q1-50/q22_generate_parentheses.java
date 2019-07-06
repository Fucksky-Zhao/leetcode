class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String item = "";
        if (n <= 0) return res;
        helper(n, n, item, res);
        return res;
    }

    private void helper(int l, int r, String item, List res) {
        if (l > r) return;
        if (l == 0) {
            while (r-- > 0) item += ')';
            res.add(item);
            return;
        }
        if (l == r) {
            item += '(';
            helper(l-1, r, item, res);
        } else {
            String item1 = item + '(';
            helper(l-1, r, item1, res);
            helper(l, r-1, item+')',res);
        }
    }
}
